package com.example.qualsupervce

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pergunta3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta3)

        val opcao1 = findViewById<Button>(R.id.button)
        val opcao2 = findViewById<Button>(R.id.button2)
        val valor1 = intent.getStringExtra("Valor1")
        val valor2 = intent.getStringExtra("Valor2")

        opcao1.setOnClickListener {
            val valor = "1"
            val intent = Intent(this, Resultado::class.java)

            intent.putExtra("Valor1", valor1)
            intent.putExtra("Valor2", valor2)
            intent.putExtra("Valor3", valor)
            startActivity(intent)
        }
        opcao2.setOnClickListener {
            val valor = "2"
            val intent = Intent(this, Resultado::class.java)

            intent.putExtra("Valor1", valor1)
            intent.putExtra("Valor2", valor2)
            intent.putExtra("Valor3", valor)
            startActivity(intent)
        }

    }
}