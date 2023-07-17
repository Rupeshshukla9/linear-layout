package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    // variable declaration
    var etName : EditText ?=null
    var etRollno : EditText ?=null
    var etHeight : EditText ?=null
    var btnValidation : Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //initialization
        etName = findViewById(R.id.etName)

    }
}