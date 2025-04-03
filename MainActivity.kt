package com.example.projeto1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button1: Button = findViewById(R.id.button_1)
        val button2: Button = findViewById(R.id.button_2)
        val resultText: TextView = findViewById(R.id.result)
        val editText: EditText = findViewById(R.id.exemplo)

        button1.setOnClickListener {
            editText.setText("Selecionado: Botão 1")
            resultText.text = "Você selecionou o botão 1"
            resultText.visibility = TextView.VISIBLE
        }

        button2.setOnClickListener {
            editText.setText("Selecionado: Botão 2")
            resultText.text = "Você selecionou o botão 2"
            resultText.visibility = TextView.VISIBLE
        }
    }
}
