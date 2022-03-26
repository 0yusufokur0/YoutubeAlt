package com.resurrection.youtubealt.ui.main.fragments.home

import androidx.lifecycle.MutableLiveData
import com.resurrection.base.core.viewmodel.BaseViewModel
import com.resurrection.base.util.Resource
import com.resurrection.youtubealt.data.model.video.VideoResponseModel
import com.resurrection.youtubealt.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeRepository: HomeRepository) :
    BaseViewModel() {

    private val _videoList = MutableLiveData<Resource<VideoResponseModel>>()
    val videoList = _videoList.toLiveData()

    fun getVideoList(region: String) =
        _videoList.setData(request = { homeRepository.getTrendVideos(region) })

}