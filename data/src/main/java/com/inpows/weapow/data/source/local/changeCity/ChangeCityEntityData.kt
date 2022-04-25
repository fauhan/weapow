package com.inpows.weapow.data.source.local.changeCity

import com.inpows.weapow.domain.model.CityDomain
import kotlinx.coroutines.flow.Flow


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version ChangeCityEntityData, v 0.1 24/04/22 17.54 by Fauhan Handay Pugar
 */
interface ChangeCityEntityData {
    fun saveCity(cityId: String): Flow<String>
    fun loadCityName(): Flow<String>
}