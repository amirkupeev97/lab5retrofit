package com.example.todolist.ui.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.R
import com.example.todolist.model.Todo
import com.example.todolist.ui.TodoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.todos_fragment.*

class TodosFragment : Fragment(R.layout.todos_fragment) {


    val todoAdapter = TodoAdapter(mutableListOf(
        Todo("Car" , false , "152145" , " fix  the car ", "car issues" , "2 days") ,
        Todo("Grass" , false , "1521784" , " cut grass ", "jkj" , "1 day") ,
        Todo("Movie" , true , "1524785" , " cut grass ", "jkj" , "1 day") ,

    ))




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {

            return inflater.inflate(R.layout.todos_fragment, container, false)

            fun getView(): View? {
                return super.getView()
            }


        }





    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvTodoItems.adapter=todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager(activity)
    }


}

