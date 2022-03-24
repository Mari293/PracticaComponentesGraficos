package com.example.registrodeestudiantes

import Classes.Operations
import Classes.Operations.Companion.listStudents
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var operations: Operations?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRegister:Button = findViewById(R.id.btnRegister)
        buttonRegister.setOnClickListener{onClick(1)}
        val buttonStatistics:Button = findViewById(R.id.btnStatistics)
        buttonStatistics.setOnClickListener{onClick(2)}
        val buttonHelp :Button = findViewById(R.id.btnHelp)
        buttonHelp.setOnClickListener{onClick(3)}

    }

    private fun onClick(boton: Int) {
        operations = Operations()
        when(boton){
            1->{
                val intent = Intent(this,RegisterActivity::class.java)
                startActivity(intent)
            }
            2->{
                if(listStudents.count()==0){
                    Toast.makeText(this,"Aún no hay registros", Toast.LENGTH_SHORT).show()
                }
                else{
                    val intent = Intent(this,StatisticsActivity::class.java)
                    startActivity(intent)
                }
            }
            3->{
                val intent = Intent(this,HelpActivity::class.java)
                startActivity(intent)
            }
        }
    }
}