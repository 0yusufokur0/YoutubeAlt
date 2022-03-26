package com.resurrection.youtubealt.ui.main.fragments.home

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.base.general.toast
import com.resurrection.base.widget.init
import com.resurrection.base.widget.setVerticalLinearLayoutManager
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.HomeFragmentBinding
import com.resurrection.youtubealt.ui.main.adapter.VideoListAdapter
import com.resurrection.youtubealt.ui.main.util.MainConstants
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>(
    R.layout.home_fragment,
    HomeViewModel::class.java
) {

    lateinit var videoListAdapter:VideoListAdapter
    override fun init(savedInstanceState: Bundle?) {
        initVideoListAdapter()
        fetchVideoList()

    }
    private fun initVideoListAdapter(){
        videoListAdapter = VideoListAdapter{ videoModel ->
            videoModel.url?.let {
                dataHolder.putString(MainConstants.VIDEO_ID, it.replace("/watch?v=",""))
                findNavController().navigate(R.id.videoFragment)
            }
        }
        binding.videoRecyclerView.init(videoListAdapter)
    }

    private fun fetchVideoList() {
        viewModel.getVideoList("US")
        viewModel.videoList.observeData(success = { videoList ->
            videoList ?: kotlin.run { return@observeData }
            videoListAdapter.addAll(videoList)
        }, loading = {
            //TODO:show progress bar or toast
        }, error = {
            toast("error")
        })
    }

}
