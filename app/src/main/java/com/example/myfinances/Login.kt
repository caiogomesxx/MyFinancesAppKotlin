package com.example.myfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        findViewById<Button>(R.id.loginbtn).setOnClickListener {


            val newIntent = Intent(this, Login::class.java)


            startActivity(newIntent)
        }
        findViewById<Button>(R.id.cancelbtn).setOnClickListener {


            val newIntent = Intent(this, MainActivity::class.java)


            startActivity(newIntent)
        }
        findViewById<TextView>(R.id.forgotpassword).setOnClickListener {


            val newIntent = Intent(this, Login::class.java)


            startActivity(newIntent)
        }
    }
}