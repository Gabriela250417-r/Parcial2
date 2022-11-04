package com.example.parcial2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ModAdp(
    var imagenLista:ArrayList<ImagenesItems>,
    var context:Context
):BaseAdapter() {
    override fun getCount(): Int {
        return imagenLista.size
    }

    override fun getItem(p0: Int): Any {
        return imagenLista[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var vista = p1
        if(vista == null){
            vista = LayoutInflater.from(context).inflate(R.layout.fila_item,p2,false)
        }
        var imagenVista:ImageView = vista!!.findViewById(R.id.iv_Tabla)
        var Especie:TextView = vista!!.findViewById(R.id.tv_Especie)
        var Sexo:TextView = vista!!.findViewById(R.id.tv_Sexo)
        var Habitat:TextView = vista!!.findViewById(R.id.tv_Habitat)

        val ImagenesItems = imagenLista[p0]
        imagenVista.setImageResource(ImagenesItems.imagen)
        return vista
    }
}