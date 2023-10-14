package com.luizafmartinez.electriccarapp.electriccarapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.luizafmartinez.electriccarapp.R
import com.luizafmartinez.electriccarapp.electriccarapp.presentation.adapter.CarAdapter

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular: Button

    lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListener()
        setupList()
    }

    fun setupView() {

        btnCalcular = findViewById(R.id.btn_calcular)

        listaCarros = findViewById(R.id.rv_lista_carros)
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
        val adapter = CarAdapter(dados)
        //listaCarros.layoutManager = LinearLayoutManager(this)
        listaCarros.adapter = adapter
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
