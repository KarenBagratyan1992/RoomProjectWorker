package com.example.roomprojectworker

import android.text.Editable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class WorkerEntity(
    @PrimaryKey(autoGenerate = true)
    val id:Int?=0,
    val name:String?,
    val surname:String?,
    val age: String?,
    val salary: String?

        )
