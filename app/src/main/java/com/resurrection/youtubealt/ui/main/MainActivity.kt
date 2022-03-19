package com.resurrection.youtubealt.ui.main

import android.os.Bundle
import com.resurrection.base.core.activity.BaseActivity
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(
    R.layout.activity_main,
    MainActivityViewModel::class.java
) {

    override fun init(savedInstanceState: Bundle?) {

    }

}