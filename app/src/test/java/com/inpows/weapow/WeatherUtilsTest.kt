package com.inpows.weapow

import com.inpows.weapow.core.const.WeatherTypes
import com.inpows.weapow.dashboard.utils.WeatherUtils
import org.junit.Assert
import org.junit.Test


/**
 * @author Fauhan Handay Pugar (fauhan.pugar@dana.id)
 * @version WeatherUtilsTest, v 0.1 28/04/22 10.49 by Fauhan Handay Pugar
 */
class WeatherUtilsTest {

    @Test
    fun weatherAssetsByType_isCorrect(){
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.CLEAR_SKY_DAY),
            "ic_sunny_01d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.CLEAR_SKY_NIGHT),
            "ic_moon_01n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.FEW_CLOUDS_DAY),
            "ic_few_clouds_02d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.FEW_CLOUDS_NIGHT),
            "ic_few_clouds_02n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.SCATTERED_CLOUD_DAY),
            "ic_scattered_clouds_03d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.SCATTERED_CLOUD_NIGHT),
            "ic_scattered_clouds_03n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.BROKEN_CLOUDS_DAY),
            "ic_broken_clouds_04d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.BROKEN_CLOUDS_NIGHT),
            "ic_broken_clouds_04n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.SHOWER_RAIN_DAY),
            "ic_shower_rain_09d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.SHOWER_RAIN_NIGHT),
            "ic_shower_rain_09n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.RAIN_DAY),
            "ic_rain_10d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.RAIN_NIGHT),
            "ic_rain_10n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.THUNDERSTORM_DAY),
            "ic_thunderstorm_11d.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(WeatherTypes.THUNDERSTORM_NIGHT),
            "ic_thunderstorm_11n.json"
        )
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType("12d"),
            "ic_splash.json"
        )
    }

    @Test
    fun weatherAssetsByType_isEmpty(){
        Assert.assertEquals(
            WeatherUtils.setWeatherAssetByType(""),
            "ic_splash.json"
        )
    }
}