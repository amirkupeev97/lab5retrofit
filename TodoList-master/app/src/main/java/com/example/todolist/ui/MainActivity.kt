package com.example.todolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.MainViewModel
import com.example.todolist.MainViewModelFactory
import com.example.todolist.R
import com.example.todolist.model.Todo
import com.example.todolist.repository.Repository
import com.example.todolist.ui.fragments.TodosFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
      val manager = supportFragmentManager
      private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this , viewModelFactory).get(MainViewModel :: class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this , Observer {response ->
            Log.d("Response",response.ID.toString())
            Log.d("Response",response.completed.toString())
            Log.d("Response",response.title.toString())
        })
        ShowFragment()



    }
    fun ShowFragment(){

            val transaction = manager.beginTransaction()
            val fragment = TodosFragment()
            transaction.replace(R.id.listfrag, fragment)
            transaction.commit()

        }

    }

