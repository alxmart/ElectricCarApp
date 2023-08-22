package com.luizafmartinez.electriccarapp.electriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.luizafmartinez.electriccarapp.R

class MainActivity : AppCompatActivity() {

    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
        setupListener()
    }

    fun setupView() {
//        preco = findViewById<EditText>(R.id.et_preco_kwh)
//        kmPercorrido = findViewById(R.id.et_km_percorrido)
//        resultado = findViewById(R.id.tv_resultado)
//        btnCalcular = findViewById<Button>(R.id.btn_calcular)
          btnCalcular = findViewById(R.id.btn_calcular)
    }

    fun setupListener() {
        btnCalcular.setOnClickListener {
            //calcular()
            val intent = Intent(
                this,
                CalcularAutonomiaActivity::class.java
            )
            startActivity(intent)
        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km
        resultado.text = result.toString()
    }
}
