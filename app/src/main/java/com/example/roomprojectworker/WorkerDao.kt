package com.example.roomprojectworker

import androidx.room.*

@Dao()
interface WorkerDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insert(worker:WorkerEntity)

    @Delete
    suspend fun delete(worker: WorkerEntity):Int

}