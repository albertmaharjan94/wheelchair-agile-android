package com.softwarica.wheelchairapp.network.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.softwarica.wheelchairapp.network.model.Tracker
import com.softwarica.wheelchairapp.network.model.User

@Dao
interface TrackerDao {
    @Insert
    suspend fun addTracker(tracker: Tracker)

    @Query("select * from Tracker")
    suspend fun selectTracker(): Array<Tracker>

    @Delete
    suspend fun deleteTracker(tracker: Tracker)
}