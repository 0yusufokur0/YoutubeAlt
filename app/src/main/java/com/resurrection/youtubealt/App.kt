package com.resurrection.youtubealt

import com.resurrection.base.core.application.BaseApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : BaseApplication() {

    override fun init() {
        networkManager.init(baseUrl = BuildConfig.API_URL)
    }

}