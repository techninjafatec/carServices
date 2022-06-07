package com.mapbox.navigation.examples.preview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AlcoolGasolina : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_MapboxNavigationExamples)
        setContentView(R.layout.activity_alcool_gasolina)

        val edit_gasolina = findViewById<EditText>(R.id.editTextGasolina)
        val edit_alcool = findViewById<EditText>(R.id.editTextAlcool)
        val btn_Calcular = findViewById<Button>(R.id.btn_Calcular)
        val txt_resultado = findViewById<TextView>(R.id.textViewResultado)

        btn_Calcular.setOnClickListener{
            val gasolina = edit_gasolina.text.toString().toDouble()
            val alcool = edit_alcool.text.toString().toDouble()
            val resultado = alcool / gasolina

            if (resultado >= 0.7){
                txt_resultado.text ="A melhor opção para abastecer é GASOLINA"
            }else{
                txt_resultado.text ="A melhor opção para abastecer é ÁLCOOL"
            }
        }
    }
}