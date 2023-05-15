package com.example.myfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class TelaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)

        findViewById<Button>(R.id.btnMenu).setOnClickListener {

            val newIntent = Intent(this, Menu::class.java)

            startActivity(newIntent)
        }


    }
}