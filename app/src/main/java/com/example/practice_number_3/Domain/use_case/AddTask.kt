package com.example.practice_number_3.Domain.use_case

import com.example.practice_number_3.Domain.model.Task
import com.example.practice_number_3.Domain.repository.Repository

class AddTask(private val repository: Repository) {

    suspend operator fun invoke(task: Task){
        repository.addTask(task)
    }
}