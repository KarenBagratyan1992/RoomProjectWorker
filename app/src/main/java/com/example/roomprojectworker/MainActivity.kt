package com.example.roomprojectworker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import androidx.lifecycle.lifecycleScope
import com.example.roomprojectworker.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    val context = this
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.setup?.setOnClickListener {
            add()
        }
}

    fun add(){
    var name = binding?.name?.text.toString()
    var surname = binding?.surname?.text.toString()
    var age = binding?.age?.text?.toString()
    var salary = binding?.salary?.text?.toString()
    lifecycleScope.launch {
        val worker = WorkerEntity(0, name = name, surname, age , salary )
        withContext(Dispatchers.IO){
            val db = WorkerDatabase.getInstance(context).getDatabase().insert(worker)
        }
    }


    }
}



