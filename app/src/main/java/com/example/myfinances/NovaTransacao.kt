package com.example.myfinances

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class NovaTransacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_transacao)

        findViewById<ImageView>(R.id.goBack).setOnClickListener {
            finish()
        }
    }
}