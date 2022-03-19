package com.resurrection.youtubealt.ui.library

import android.os.Bundle
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.FragmentLibraryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LibraryFragment:BaseFragment<FragmentLibraryBinding, LibraryViewModel>(R.layout.fragment_library, LibraryViewModel::class.java) {

    override fun init(savedInstanceState: Bundle?) {

    }

}