package com.resurrection.youtubealt.ui.discover

import android.os.Bundle
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.FragmentDiscoverBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DiscoverFragment :BaseFragment<FragmentDiscoverBinding, DiscoverViewModel>(R.layout.fragment_discover, DiscoverViewModel::class.java) {

    override fun init(savedInstanceState: Bundle?) {

    }
}