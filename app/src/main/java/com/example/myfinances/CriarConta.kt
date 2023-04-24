package com.example.myfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class CriarConta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_conta)
        findViewById<Button>(R.id.criarContaBtn).setOnClickListener {


            val newIntent = Intent(this, Login::class.java)


            startActivity(newIntent)
        }
        findViewById<Button>(R.id.cancelBtn).setOnClickListener {


            val newIntent = Intent(this, MainActivity::class.java)


            startActivity(newIntent)
        }

    }
}