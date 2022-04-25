package com.inpows.weapow.domain.repository.local

import com.inpows.weapow.domain.model.CityDomain
import kotlinx.coroutines.flow.Flow


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version ChangeCityRepository, v 0.1 24/04/22 16.30 by Fauhan Handay Pugar
 */
interface CityRepository {
    fun loadCity(): Flow<String>
    fun saveCity(cityId: String): Flow<String>
}