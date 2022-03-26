package com.resurrection.youtubealt.ui.main.fragments.player

import androidx.lifecycle.MutableLiveData
import com.resurrection.base.core.viewmodel.BaseViewModel
import com.resurrection.base.util.Resource
import com.resurrection.youtubealt.data.model.streams.StreamsResponseModel
import com.resurrection.youtubealt.data.model.video.VideoResponseModel
import com.resurrection.youtubealt.data.repository.VideoPlayerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VideoPlayerViewModel @Inject constructor(private val videoPlayerRepository: VideoPlayerRepository): BaseViewModel(){

    private val _streams = MutableLiveData<Resource<StreamsResponseModel>>()
    val streams = _streams.toLiveData()

    fun getStreams(videoId: String) = _streams.setData(request = { videoPlayerRepository.getStreams(videoId) })

}