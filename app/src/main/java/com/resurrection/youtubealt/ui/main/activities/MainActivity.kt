package com.resurrection.youtubealt.ui.main.activities

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.resurrection.base.core.activity.BaseActivity
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class.java
) {

    val navController: NavController by lazy { (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment?)?.navController!! }

    override fun init(savedInstanceState: Bundle?) {
        binding.homeBtn.setOnClickListener {
            navController.navigate(R.id.homeFragment)
        }
        binding.discoverBtn.setOnClickListener {
            navController.navigate(R.id.discoverFragment)
        }
        binding.shortsBtn.setOnClickListener {
            navController.navigate(R.id.shortsFragment)
        }
        binding.subscriptionsBtn.setOnClickListener {
            navController.navigate(R.id.subscriptionsFragment)
        }
        binding.libraryBtn.setOnClickListener {
            navController.navigate(R.id.libraryFragment)
        }
    }

}