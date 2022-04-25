package com.inpows.weapow.data.repository.weatherInfo

import com.inpows.weapow.data.source.remote.weatherInfo.NetworkWeatherInfoEntityData
import com.inpows.weapow.domain.model.WeatherRootDomain
import com.inpows.weapow.domain.repository.network.WeatherInfoRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherInfoEntityRepository @Inject constructor(
    private val networkEntityData: NetworkWeatherInfoEntityData
) : WeatherInfoRepository {
    override fun getWeather(cityName: String): Flow<WeatherRootDomain> {
        return networkEntityData.getWeatherInfo(cityName)
    }

}