package com.lespsan543.ejemploroom.addtask.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskEntity (
    @PrimaryKey
    val id: Int,
    val task: String,
    var selected: Boolean = false
)