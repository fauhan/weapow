package com.inpows.weapow.dashboard.utils

import com.inpows.weapow.core.const.WeatherTypes


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version WeatherUtils, v 0.1 28/04/22 10.44 by Fauhan Handay Pugar
 */
object WeatherUtils {
    fun setWeatherAssetByType(iconType: String): String{
        return when (iconType) {
            WeatherTypes.CLEAR_SKY_DAY -> {
                "ic_sunny_01d.json"
            }
            WeatherTypes.CLEAR_SKY_NIGHT -> {
                "ic_moon_01n.json"
            }
            WeatherTypes.FEW_CLOUDS_DAY -> {
                "ic_few_clouds_02d.json"
            }
            WeatherTypes.FEW_CLOUDS_NIGHT -> {
                "ic_few_clouds_02n.json"
            }
            WeatherTypes.SCATTERED_CLOUD_DAY -> {
                "ic_scattered_clouds_03d.json"
            }
            WeatherTypes.SCATTERED_CLOUD_NIGHT -> {
                "ic_scattered_clouds_03n.json"
            }
            WeatherTypes.BROKEN_CLOUDS_DAY -> {
                "ic_broken_clouds_04d.json"
            }
            WeatherTypes.BROKEN_CLOUDS_NIGHT -> {
                "ic_broken_clouds_04n.json"
            }
            WeatherTypes.SHOWER_RAIN_DAY -> {
                "ic_shower_rain_09d.json"
            }
            WeatherTypes.SHOWER_RAIN_NIGHT -> {
                "ic_shower_rain_09n.json"
            }
            WeatherTypes.RAIN_DAY -> {
                "ic_rain_10d.json"
            }
            WeatherTypes.RAIN_NIGHT -> {
                "ic_rain_10n.json"
            }
            WeatherTypes.THUNDERSTORM_DAY-> {
                "ic_thunderstorm_11d.json"
            }
            WeatherTypes.THUNDERSTORM_NIGHT-> {
                "ic_thunderstorm_11n.json"
            }
            else -> {
                "ic_splash.json"
            }
        }
    }
}