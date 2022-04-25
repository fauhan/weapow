package com.inpows.weapow.domain.repository.network

import com.inpows.weapow.domain.model.WeatherRootDomain
import kotlinx.coroutines.flow.Flow

interface WeatherInfoRepository {
    fun getWeather(cityId: String): Flow<WeatherRootDomain>
}