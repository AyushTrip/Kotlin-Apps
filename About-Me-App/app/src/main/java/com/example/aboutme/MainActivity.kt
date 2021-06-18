package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Create data binding variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Create binding instance using BindingUtil and activity main
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        //Create variables and functionality

        //val doneButton: Button = findViewById(R.id.button)
        //val editText: EditText = findViewById(R.id.editTextTextPersonName)
        //val nickname: TextView = findViewById(R.id.nickname)
        
        binding.button.setOnClickListener{
            binding.nickname.text = binding.editTextTextPersonName.text.toString()
        }
    }
}