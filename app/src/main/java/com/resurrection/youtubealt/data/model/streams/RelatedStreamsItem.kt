package com.resurrection.youtubealt.data.model.streams

import com.google.gson.annotations.SerializedName

data class RelatedStreamsItem(

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("uploaderName")
	val uploaderName: String? = null,

	@field:SerializedName("uploaderAvatar")
	val uploaderAvatar: String? = null,

	@field:SerializedName("uploaded")
	val uploaded: Long? = null,

	@field:SerializedName("uploaderVerified")
	val uploaderVerified: Boolean? = null,

	@field:SerializedName("shortDescription")
	val shortDescription: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("uploaderUrl")
	val uploaderUrl: String? = null,

	@field:SerializedName("uploadedDate")
	val uploadedDate: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("views")
	val views: Int? = null
)