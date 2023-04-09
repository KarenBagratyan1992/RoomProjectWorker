package com.example.roomprojectworker

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [WorkerEntity::class], version = 1)
abstract class WorkerDatabase:RoomDatabase() {
    abstract fun getDatabase():WorkerDao

    companion object{
        private var INSTANCE:WorkerDatabase?=null
        fun getInstance(context: Context):WorkerDatabase{
            return INSTANCE?: Room
                .databaseBuilder(context.applicationContext, WorkerDatabase::class.java, "Personal")
                .build().also { INSTANCE = it }
        }

    }
}