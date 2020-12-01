package com.example.todolist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todolist.model.Todo
import com.example.todolist.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {
    val myResponse: MutableLiveData<Todo> = MutableLiveData()
    fun getPost() {
        viewModelScope.launch{
            val response : Todo = repository.getPost()
            myResponse.value = response
        }

    }
}