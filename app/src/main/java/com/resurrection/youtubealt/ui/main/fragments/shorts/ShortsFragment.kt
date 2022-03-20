package com.resurrection.youtubealt.ui.main.fragments.shorts

import android.os.Bundle
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.FragmentShortsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShortsFragment :BaseFragment<FragmentShortsBinding,ShortsViewModel>(R.layout.fragment_shorts,ShortsViewModel::class.java) {

    override fun init(savedInstanceState: Bundle?) {

    }

}