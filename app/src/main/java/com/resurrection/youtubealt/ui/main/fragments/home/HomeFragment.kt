package com.resurrection.youtubealt.ui.main.fragments.home

import android.os.Bundle
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.HomeFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding,HomeViewModel>(R.layout.home_fragment, HomeViewModel::class.java) {

    override fun init(savedInstanceState: Bundle?) {

    }

}