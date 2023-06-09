package com.example.myfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.createAccountBtn).setOnClickListener {


            val newIntent = Intent(this, CriarConta::class.java)


            startActivity(newIntent)
        }
        findViewById<Button>(R.id.googlebtn).setOnClickListener {


            val newIntent = Intent(this, Login::class.java)


            startActivity(newIntent)
        }
        findViewById<Button>(R.id.alreadyHaveAccountbtn).setOnClickListener {


            val newIntent = Intent(this, Login::class.java)


            startActivity(newIntent)
        }
    }
}