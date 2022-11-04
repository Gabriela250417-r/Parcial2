package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private var gvtabla:GridView?=null

    var Especie = arrayListOf<String>("Perro", "Delfin", "Murcielago", "Lombriz")
    var Sexo = arrayListOf<String>("Varon", "Hembra", "Varon", "Hembra")
    var Habitat = arrayListOf<String>("Terrestre", "Acuatico", "Volador", "Terrestre")
    var imagenes = arrayOf(
        R.drawable.perro,
        R.drawable.delfin,
        R.drawable.murcielago,
        R.drawable.lombriz
    )

    var imagenesLista = arrayOf(
        ImagenesItems(imagenes.get(0), Especie.get(0), Sexo.get(0), Habitat.get(0)),
        ImagenesItems(imagenes.get(1), Especie.get(1), Sexo.get(1), Habitat.get(1)),
        ImagenesItems(imagenes.get(2), Especie.get(2), Sexo.get(2), Habitat.get(2)),
        ImagenesItems(imagenes.get(3), Especie.get(3), Sexo.get(3), Habitat.get(3)),
    )

    var myImagenLista = ArrayList<ImagenesItems>()

    var modAdp: ModAdp? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (imagen in imagenesLista){
            myImagenLista.add(imagen)
        }
        gvtabla = findViewById(R.id.gdv_Tabla)

        modAdp = ModAdp(myImagenLista, this)
        gvtabla?.adapter = modAdp

        gvtabla?.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                
            }

        }

    }
}