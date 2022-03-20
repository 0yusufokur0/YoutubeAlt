package com.resurrection.youtubealt.ui.main.fragments.subscriptions

import android.os.Bundle
import com.resurrection.base.core.fragment.BaseFragment
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.FragmentSubscriptionsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SubscriptionsFragment : BaseFragment<FragmentSubscriptionsBinding, SubscriptionsViewModel>(
    R.layout.fragment_subscriptions, SubscriptionsViewModel::class.java
) {
    override fun init(savedInstanceState: Bundle?) {

    }
}