package com.lespsan543.ejemploroom.addtask.ui

import com.lespsan543.ejemploroom.addtask.ui.model.TaskModel

sealed interface TaskUiState {
    object Loading: TaskUiState
    data class Error(val throwable: Throwable): TaskUiState
    data class Success(val tasks:List<TaskModel>) : TaskUiState
}