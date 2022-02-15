package com.example.taskgiphyapp

import com.google.gson.annotations.SerializedName

data class DataResult(
    @SerializedName("data") val res: List<DataObject>
)

data class DataObject(
    @SerializedName("images") val images: DataImage
)

data class DataImage(
    @SerializedName("original") val ogImage: ogImage
)

data class ogImage(
    val url: String = "https://media.giphy.com/media/l3q2Yy64xyWwmEYyQ/giphy.gif"
)