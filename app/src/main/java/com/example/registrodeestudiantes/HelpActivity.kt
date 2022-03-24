package com.example.registrodeestudiantes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val back:ImageView=findViewById(R.id.imgBack)
        back.setOnClickListener{onClick()}
    }

    private fun onClick() {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
