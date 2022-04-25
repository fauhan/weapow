package com.inpows.weapow.domain.interactor

import com.inpows.weapow.domain.DefaultDispatcher
import com.inpows.weapow.domain.core.usecase.FlowUseCase
import com.inpows.weapow.domain.model.Result
import com.inpows.weapow.domain.model.WeatherRootDomain
import com.inpows.weapow.domain.repository.network.WeatherInfoRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetWeatherInfoInteractor @Inject constructor(
    @DefaultDispatcher dispatcher: CoroutineDispatcher,
    private val weatherInfoRepository: WeatherInfoRepository
) : FlowUseCase<GetWeatherInfoInteractor.Params, WeatherRootDomain>(dispatcher) {

    data class Params(var cityId: String)

    override fun execute(params: Params): Flow<Result<WeatherRootDomain>> {
        return weatherInfoRepository.getWeather(params.cityId).map {
            Result.Success(it)
        }
    }

}