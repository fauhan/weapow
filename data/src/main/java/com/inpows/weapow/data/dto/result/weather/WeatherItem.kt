package com.inpows.weapow.data.dto.result.weather

import androidx.annotation.DrawableRes

data class WeatherItem(
    @DrawableRes val resIcon: Int,
    val label: String,
    val value: String
)
