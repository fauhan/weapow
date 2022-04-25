package com.inpows.weapow.data.dto.result

import com.google.gson.annotations.SerializedName

data class CoordinateDto(
    @SerializedName("lon")
    var lon: Double = 0.0,
    @SerializedName("lat")
    var lat: Double = 0.0
)
