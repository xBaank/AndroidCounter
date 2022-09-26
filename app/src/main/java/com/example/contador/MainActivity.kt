package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSumar(view: View) {
        contador++
        val texto = findViewById<TextView>(R.id.contador)
        texto.text = contador.toString()
    }
    fun onMinimizar(view: View) {
        contador--
        val texto = findViewById<TextView>(R.id.contador)
        texto.text = contador.toString()
    }

    fun onReset(view: View) {
        contador = 0
        val texto = findViewById<TextView>(R.id.contador)
        texto.text = contador.toString()
    }

    fun onExit(view: View) {
        finish()
    }
}