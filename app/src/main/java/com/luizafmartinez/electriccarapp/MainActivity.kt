package com.luizafmartinez.electriccarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch

class MainActivity : AppCompatActivity() {

    lateinit var preco: EditText
    lateinit var btnCalcular: Button
    lateinit var radioGrupo: RadioGroup
    lateinit var checkBox1: CheckBox
    lateinit var checkBox2: CheckBox
    lateinit var switch: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
        setupListener()
    }
    fun setupView() {
         preco = findViewById<EditText>(R.id.et_preco_kwh)
         btnCalcular = findViewById<Button>(R.id.btn_calcular)
         radioGrupo = findViewById<RadioGroup>(R.id.rg_comida_favorita)
         checkBox1 = findViewById<CheckBox>(R.id.cb_compromisso_1)
         checkBox2 = findViewById<CheckBox>(R.id.cb_compromisso_2)
         switch = findViewById<Switch>(R.id.s_lampada)
    }
    fun setupListener() {

        btnCalcular.setOnClickListener {
            val textoDitado = preco.text.toString()
            Log.d("texto digitado ->", textoDitado)
        }

        if(checkBox1.isChecked) {
            Log.d("compromisso","1 feito")
        } else {
            Log.d("compromisso","1 não foi feito")
        }

        if(checkBox2.isChecked) {
            Log.d("compromisso","2 feito")
        } else {
            Log.d("compromisso","2 não foi feito")
        }

        radioGrupo.setOnCheckedChangeListener { radioGroup: RadioGroup, checkedId: Int ->
            val radio = findViewById<RadioButton>(checkedId)
            Log.d("Opção Selecionada:", radio.text.toString())
        }

        switch.setOnCheckedChangeListener { compoundButton: CompoundButton, isChecked: Boolean ->
            if(isChecked) {
                Log.d("Interruptor:",  "Ligado ${isChecked}")
            } else {
                Log.d("Interruptor:",  "Ligado ${isChecked}")
            }
        }



    }

}

