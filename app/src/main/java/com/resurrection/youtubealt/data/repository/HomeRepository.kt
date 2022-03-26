package com.resurrection.youtubealt.data.repository

import com.resurrection.base.component.NetworkManager
import com.resurrection.youtubealt.data.model.video.VideoResponseModel

class HomeRepository(private val networkManager: NetworkManager) {

    fun getTrendVideos(region: String = "US") = networkManager.newRequest(
        path = "trending?region=$region",
        responseType = VideoResponseModel::class.java
    )

}