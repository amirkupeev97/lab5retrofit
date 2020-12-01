package com.example.todolist.api
import com.example.todolist.model.Todo
import retrofit2.http.GET
interface SimpleApi {
    @GET("todos/1")
        suspend fun getPost(): Todo
}