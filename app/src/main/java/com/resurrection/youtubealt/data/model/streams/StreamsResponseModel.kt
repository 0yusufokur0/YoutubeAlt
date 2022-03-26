package com.resurrection.youtubealt.data.model.streams

import com.google.gson.annotations.SerializedName

data class StreamsResponseModel(

	@field:SerializedName("subtitles")
	val subtitles: List<Any?>? = null,

	@field:SerializedName("chapters")
	val chapters: List<Any?>? = null,

	@field:SerializedName("proxyUrl")
	val proxyUrl: String? = null,

	@field:SerializedName("uploaderAvatar")
	val uploaderAvatar: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("uploaderVerified")
	val uploaderVerified: Boolean? = null,

	@field:SerializedName("dislikes")
	val dislikes: Int? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("uploaderUrl")
	val uploaderUrl: String? = null,

	@field:SerializedName("hls")
	val hls: String? = null,

	@field:SerializedName("livestream")
	val livestream: Boolean? = null,

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("relatedStreams")
	val relatedStreams: List<RelatedStreamsItem?>? = null,

	@field:SerializedName("uploadDate")
	val uploadDate: String? = null,

	@field:SerializedName("uploader")
	val uploader: String? = null,

	@field:SerializedName("videoStreams")
	val videoStreams: List<VideoStreamsItem?>? = null,

	@field:SerializedName("audioStreams")
	val audioStreams: List<AudioStreamsItem?>? = null,

	@field:SerializedName("dash")
	val dash: Any? = null,

	@field:SerializedName("lbryId")
	val lbryId: Any? = null,

	@field:SerializedName("views")
	val views: Int? = null,

	@field:SerializedName("thumbnailUrl")
	val thumbnailUrl: String? = null,

	@field:SerializedName("likes")
	val likes: Int? = null
)