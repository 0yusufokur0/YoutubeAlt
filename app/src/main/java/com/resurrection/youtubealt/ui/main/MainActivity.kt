package com.resurrection.youtubealt.ui.main

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.resurrection.base.core.activity.BaseActivity
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainActivityViewModel>(
    R.layout.activity_main,
    MainActivityViewModel::class.java
) {

    val navController: NavController by lazy { (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment?)?.navController!! }

    override fun init(savedInstanceState: Bundle?) {

    }

}