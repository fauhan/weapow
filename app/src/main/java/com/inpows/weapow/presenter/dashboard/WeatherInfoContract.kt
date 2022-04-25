package com.inpows.weapow.presenter.dashboard

import com.inpows.weapow.base.AbstractContract
import com.inpows.weapow.base.AbstractContractKt
import com.inpows.weapow.domain.model.WeatherRootDomain

interface WeatherInfoContract {
    interface View : AbstractContractKt.AbstractView {
        fun onSuccessGetCityLocal(cityId: String)
        fun onErrorGetCityLocal()
        fun onSuccessGetWeatherInfo(weatherRootDomain: WeatherRootDomain)
        fun onErrorGetWeatherInfo()
    }

    interface Presenter : AbstractContractKt.AbstractPresenter {

        fun loadCityLocal()

        fun getWeatherInfoByCityId(cityId: String)

        fun cancel()
    }
}