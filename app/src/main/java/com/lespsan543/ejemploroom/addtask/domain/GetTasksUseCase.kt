package com.lespsan543.ejemploroom.addtask.domain

import com.lespsan543.ejemploroom.addtask.data.TaskRepository
import com.lespsan543.ejemploroom.addtask.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}