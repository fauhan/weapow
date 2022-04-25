package com.inpows.weapow.presenter.changeCity

import com.inpows.weapow.di.PerActivity
import com.inpows.weapow.domain.interactor.LoadCityInteractor
import com.inpows.weapow.domain.interactor.SaveCityInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version ChangeCityActivityPresenter, v 0.1 24/04/22 16.23 by Fauhan Handay Pugar
 */
@PerActivity
class SelectedCityFragmentPresenter @Inject constructor(
    private val view: SelectedCityContract.View,
    private val loadCityInteractor: LoadCityInteractor,
    private val saveCityInteractor: SaveCityInteractor
) : CoroutineScope, SelectedCityContract.Presenter {

    private val mainJob = SupervisorJob()
    override val coroutineContext: CoroutineContext = mainJob

    override fun saveCityLocal(cityId: String) {
        launch(Dispatchers.Main) {
            view.showProgress()
            saveCityInteractor.invoke(
                params = SaveCityInteractor.Params(cityId),
                onSuccess = {
                    view.dismissProgress()
                    view.onSuccessSaveCityLocal(it)
                },
                onError = {
                    view.dismissProgress()
                    view.onErrorSaveCityLocal()
                }
            )
        }
    }

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

    override fun cancel() {
        mainJob.cancel()
    }

    override fun onDestroy() {
        mainJob.cancel()
    }
}