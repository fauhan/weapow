package com.inpows.weapow.domain.model

data class Weather(
    var id: Int = 0,
    var main: String = "",
    var description: String = "",
    var icon: String = ""
)