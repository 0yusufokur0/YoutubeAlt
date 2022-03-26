package com.resurrection.youtubealt.data.repository

import com.resurrection.base.component.NetworkManager
import com.resurrection.youtubealt.data.model.streams.StreamsResponseModel

class VideoPlayerRepository(private val networkManager: NetworkManager) {

    fun getStreams(videoId:String) = networkManager.newRequest(
        path = "streams/$videoId",
        responseType = StreamsResponseModel::class.java
    )

}