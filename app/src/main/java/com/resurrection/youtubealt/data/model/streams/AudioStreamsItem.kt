package com.resurrection.youtubealt.data.model.streams

import com.google.gson.annotations.SerializedName

data class AudioStreamsItem(

	@field:SerializedName("format")
	val format: String? = null,

	@field:SerializedName("fps")
	val fps: Int? = null,

	@field:SerializedName("initStart")
	val initStart: Int? = null,

	@field:SerializedName("bitrate")
	val bitrate: Int? = null,

	@field:SerializedName("mimeType")
	val mimeType: String? = null,

	@field:SerializedName("initEnd")
	val initEnd: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("quality")
	val quality: String? = null,

	@field:SerializedName("indexStart")
	val indexStart: Int? = null,

	@field:SerializedName("codec")
	val codec: String? = null,

	@field:SerializedName("videoOnly")
	val videoOnly: Boolean? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("indexEnd")
	val indexEnd: Int? = null,

	@field:SerializedName("height")
	val height: Int? = null
)