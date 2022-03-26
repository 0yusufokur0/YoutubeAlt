package com.resurrection.youtubealt.ui.main.fragments.player

import android.os.Bundle
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.MediaItem.fromUri
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.MergingMediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.base.general.toast
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.data.model.streams.AudioStreamsItem
import com.resurrection.youtubealt.databinding.FragmentVideoPlayerBinding
import com.resurrection.youtubealt.ui.main.util.MainConstants
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class VideoPlayerFragment: BaseFragment<FragmentVideoPlayerBinding,VideoPlayerViewModel>(R.layout.fragment_video_player,VideoPlayerViewModel::class.java) {

    private var exoPlayer: ExoPlayer? = null
    private var playbackPosition = 0L
    private var playWhenReady = true

    override fun init(savedInstanceState: Bundle?) {
        initVideoPlayer()
        val videoId = dataHolder.getString(MainConstants.VIDEO_ID,"")
        if (videoId != null){
            viewModel.getStreams(videoId)
            fetchVideo()
        }


    }

    private fun initVideoPlayer() {
        binding.playerView.apply {

            exoPlayer = ExoPlayer.Builder(requireContext())
                .setSeekBackIncrementMs(5000)
                .setSeekForwardIncrementMs(5000)
                .build()
            setShowSubtitleButton(true)
            setShowNextButton(false)
            setShowPreviousButton(false)
            //controllerShowTimeoutMs = 1500
            controllerHideOnTouch = true
            player = exoPlayer
        }
    }

    fun fetchVideo(){

        viewModel.streams.observeData(success ={ response->

            response?.videoStreams?.forEachIndexed { index, videoStreamsItem ->

            val dataSourceFactory: DataSource.Factory =
                DefaultHttpDataSource.Factory()
            val videoItem: MediaItem = MediaItem.Builder()
                .setUri(response.videoStreams[index]?.url)
                //.setSubtitleConfigurations(subtitle)
                .build()
            val videoSource: MediaSource = DefaultMediaSourceFactory(dataSourceFactory)
                .createMediaSource(videoItem)
            var audioSource: MediaSource = DefaultMediaSourceFactory(dataSourceFactory)
                .createMediaSource(fromUri(response.audioStreams!![0]?.url!!))
            if (response.videoStreams[index]?.quality=="720p" || response.videoStreams[index]?.quality=="1080p" || response.videoStreams[index]?.quality=="480p" ){
                audioSource = ProgressiveMediaSource.Factory(dataSourceFactory)
                    .createMediaSource(fromUri(response.audioStreams!![getMostBitRate(response.audioStreams)]?.url!!))
            }
            val mergeSource: MediaSource = MergingMediaSource(videoSource,audioSource)
            exoPlayer?.setMediaSource(mergeSource)

                exoPlayer?.prepare()
                exoPlayer?.play()

            }
        }, error = {

        }
        )






    }

    private fun getMostBitRate(audios: List<AudioStreamsItem?>):Int{
        var bitrate =0
        var index = 0
        for ((i, audio) in audios.withIndex()){
            val q = audio?.quality!!.replace(" kbps","").toInt()
            if (q>bitrate){
                bitrate=q
                index = i
            }
        }
        return index
    }


}