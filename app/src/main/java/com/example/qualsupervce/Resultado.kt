package com.example.qualsupervce

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado)

        val texto = findViewById<TextView>(R.id.textView)
        val botao = findViewById<Button>(R.id.refazer)
        val valor1 = intent.getStringExtra("Valor1")
        val valor2 = intent.getStringExtra("Valor2")
        val valor3 = intent.getStringExtra("Valor3")


        if ((valor1 + valor2 + valor3).equals("111")){
            texto.text = "Seu super heroi é o gelado"
        } else if ((valor1 + valor2 + valor3).equals("112")){
            texto.text = "Seu super heroi é o Professor xavier"
        } else if ((valor1 + valor2 + valor3).equals("121")){
            texto.text = "Seu super heroi é super choque"
        } else if ((valor1 + valor2 + valor3).equals("122")){
            texto.text = "Seu super heroi é o superman"
        } else if ((valor1 + valor2 + valor3).equals("211")){
            texto.text = "Seu super heroi é o Pantera negra"
        } else if ((valor1 + valor2 + valor3).equals("212")){
            texto.text = "Seu super heroi é o senhor fantástico"
        } else if ((valor1 + valor2 + valor3).equals("221")){
            texto.text = "Seu super heroi é o luke cage"
        } else if ((valor1 + valor2 + valor3).equals("222")){
            texto.text = "Seu super heroi é o Homen-aranha"
        }

        botao.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_browser).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://github.com/pitercastela/qualSuperVoceE"))
            startActivity(intent)
        }

    }
}