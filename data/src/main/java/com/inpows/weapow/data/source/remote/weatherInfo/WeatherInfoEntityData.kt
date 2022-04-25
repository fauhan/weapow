package com.inpows.weapow.data.source.remote.weatherInfo

import com.inpows.weapow.domain.model.WeatherRootDomain
import kotlinx.coroutines.flow.Flow

interface WeatherInfoEntityData {
    fun getWeatherInfo(cityId: String): Flow<WeatherRootDomain>
}