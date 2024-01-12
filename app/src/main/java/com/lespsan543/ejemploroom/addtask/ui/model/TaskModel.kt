package com.lespsan543.ejemploroom.addtask.ui.model

data class TaskModel(
    val id: Long = System.currentTimeMillis(),
    val task: String,
    var selected: Boolean = false
)