package com.luizafmartinez.electriccarapp.electriccarapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.luizafmartinez.electriccarapp.R

class CarAdapter(private val carros: Array<String>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init {
            textView = view.findViewById(R.id.tv_preco_value)
        }
    }

    // Cria uma nova view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item,parent,false)
      return ViewHolder(view)
    }

    // Pega a quantidade de carros da lista
    override fun getItemCount(): Int {
        return carros.size
    }

    // Pega o conteúdo da view e troca pela informação de um item da lista.
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = carros[position]
    }

}












