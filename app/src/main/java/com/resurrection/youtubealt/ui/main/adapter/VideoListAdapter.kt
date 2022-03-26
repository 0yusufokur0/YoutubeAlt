package com.resurrection.youtubealt.ui.main.adapter

import com.resurrection.base.core.adapter.BaseAdapter
import com.resurrection.youtubealt.BR
import com.resurrection.youtubealt.R
import com.resurrection.youtubealt.data.model.video.VideoModel

class VideoListAdapter(var onItemClick: ((VideoModel) -> Unit)? = null) : BaseAdapter<VideoModel>(layoutResource = R.layout.video_list_item, itemId = BR.videoItem, onItemClick = onItemClick){
 
}