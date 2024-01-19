package com.lespsan543.ejemploroom.addtask.domain

import com.lespsan543.ejemploroom.addtask.data.TaskRepository
import com.lespsan543.ejemploroom.addtask.data.toData
import com.lespsan543.ejemploroom.addtask.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel.toData())
    }
}