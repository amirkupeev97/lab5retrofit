package com.example.todolist.repository

import com.example.todolist.api.RetrofitInstance
import com.example.todolist.model.Todo

class Repository {
    suspend fun getPost() : Todo {
        return RetrofitInstance.api.getPost()

    }
}