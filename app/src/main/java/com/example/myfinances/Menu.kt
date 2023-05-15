package com.example.myfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<TextView>(R.id.tvConta).setOnClickListener {

            val newIntent = Intent(this, MinhaConta::class.java)

            startActivity(newIntent)
        }

        findViewById<TextView>(R.id.tvSair).setOnClickListener {

            val newIntent = Intent(this, MainActivity::class.java)

            startActivity(newIntent)
        }

        findViewById<ImageView>(R.id.btnHome).setOnClickListener {

            val newIntent = Intent(this, TelaPrincipal::class.java)

            startActivity(newIntent)
        }
    }
}