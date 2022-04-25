package com.inpows.weapow.presenter.dashboard

import com.inpows.weapow.di.PerActivity
import com.inpows.weapow.domain.interactor.GetWeatherInfoInteractor
import com.inpows.weapow.domain.interactor.LoadCityInteractor
import kotlinx.coroutines.*
import timber.log.Timber
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

@PerActivity
class DashboardActivityPresenter @Inject constructor(
    private val view: WeatherInfoContract.View,
    private val getWeatherInfoInteractor: GetWeatherInfoInteractor,
    private val loadCityInteractor: LoadCityInteractor
) : WeatherInfoContract.Presenter, CoroutineScope {

    private val mainJob = SupervisorJob()
    override val coroutineContext: CoroutineContext = mainJob

    override fun loadCityLocal() {
        launch(Dispatchers.Main){
            view.showProgress()
            loadCityInteractor.invoke(
                params = Unit,
                onSuccess = {
                    view.dismissProgress()
                    view.onSuccessGetCityLocal(it)
                },
                onError = {
                    view.dismissProgress()
                    view.onErrorGetCityLocal()
                }
            )
        }
    }

    override fun getWeatherInfoByCityId(cityId: String) {
        launch(Dispatchers.Main){
            view.showProgress()
            getWeatherInfoInteractor.invoke(
                params = GetWeatherInfoInteractor.Params(cityId),
                onSuccess = {
                    view.dismissProgress()
                    view.onSuccessGetWeatherInfo(it)
                },
                onError = {
                    view.dismissProgress()
                    view.onErrorGetWeatherInfo()
                }
            )
        }
    }

    override fun cancel() {
        mainJob.cancel()
    }

    override fun onDestroy() {
        mainJob.cancel()
    }
}