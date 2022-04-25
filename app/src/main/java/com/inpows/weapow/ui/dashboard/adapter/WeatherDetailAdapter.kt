package com.inpows.weapow.ui.dashboard.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inpows.weapow.databinding.ItemWeatherDetailBinding

class WeatherDetailAdapter(private val wdList: List<com.inpows.weapow.data.dto.result.weather.WeatherItem>): RecyclerView.Adapter<WeatherDetailAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemWeatherDetailBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemWeatherDetailBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(wdList[position]){
                binding.icWeatherDetail.setImageResource(this.resIcon)
                binding.tvWeatherDetailLabel.text = this.label
                binding.tvWeatherDetailValue.text = this.value
            }
        }
    }

    override fun getItemCount(): Int {
        return wdList.size
    }
}