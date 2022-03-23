package com.resurrection.youtubealt.ui.main.fragments.home

import android.os.Bundle
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.base.general.toast
import com.resurrection.base.widget.setVerticalLinearLayoutManager
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.HomeFragmentBinding
import com.resurrection.youtubealt.ui.main.adapter.VideoListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>(
    R.layout.home_fragment,
    HomeViewModel::class.java
) {

    private val homeAdapter = VideoListAdapter()

    override fun init(savedInstanceState: Bundle?) {
        fetchVideoList()
    }

    private fun fetchVideoList() {
        binding.videoRecyclerView.setVerticalLinearLayoutManager()
        binding.videoRecyclerView.adapter = homeAdapter
        viewModel.getVideoList("US")
        viewModel.videoList.observeData(success = { videoList ->
            videoList ?: kotlin.run { return@observeData }
            homeAdapter.addAll(videoList)
        }, loading = {
            //TODO:show progress bar or toast
        }, error = {
            toast("error")
        })
    }

}
