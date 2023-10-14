package com.luizafmartinez.electriccarapp.electriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import com.luizafmartinez.electriccarapp.R

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular: Button
    lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListener()
        setupList()
    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        lista = findViewById(R.id.lv_informacoes)
    }

    fun setupList() {
        var dados = arrayOf(
            "Cupcake",
            "Donut",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean"
        )
    }

    fun setupListener() {
        btnCalcular.setOnClickListener {
            val intent = Intent(
                this,
                CalcularAutonomiaActivity::class.java
            )
            startActivity(intent)
        }
    }

}
