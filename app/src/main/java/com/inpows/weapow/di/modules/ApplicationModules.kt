package com.inpows.weapow.di.modules

import android.app.Application
import android.content.Context
import com.inpows.weapow.data.JobExecutor
import com.inpows.weapow.data.repository.changeCity.CityEntityRepository
import com.inpows.weapow.data.repository.weatherInfo.WeatherInfoEntityRepository
import com.inpows.weapow.domain.executor.ThreadExecutor
import com.inpows.weapow.domain.repository.local.CityRepository
import com.inpows.weapow.domain.repository.network.WeatherInfoRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModules constructor(private var application: Application) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application

    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor = jobExecutor

    @Provides
    @Singleton
    fun provideWeatherInfoRepository(
        weatherInfoEntityRepository: WeatherInfoEntityRepository
    ): WeatherInfoRepository = weatherInfoEntityRepository

    @Provides
    @Singleton
    fun provideChangeCityRepository(
        changeCityEntityRepository: CityEntityRepository
    ): CityRepository = changeCityEntityRepository
}