package com.example.qualsupervce

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val opcao1 = findViewById<Button>(R.id.button)
        val opcao2 = findViewById<Button>(R.id.button2)

        opcao1.setOnClickListener {
            val valor = "1"
            val intent = Intent(this, Pegunta2::class.java)

            intent.putExtra("Valor1", valor)
            startActivity(intent)
        }
        opcao2.setOnClickListener {
            val valor = "2"
            val intent = Intent(this, Pegunta2::class.java)

            intent.putExtra("Valor1", valor)
            startActivity(intent)
        }

    }
}