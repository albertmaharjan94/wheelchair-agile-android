package com.softwarica.wheelchairapp.network.model

import androidx.room.TypeConverter
import com.google.gson.Gson

class TrackerTypeConverter {

    @TypeConverter
    fun arrayToJson(value: Coordinates) = Gson().toJson(value)

    @TypeConverter
    fun jsonToArray(value: String) = Gson().fromJson(value, Coordinates::class.java)

}