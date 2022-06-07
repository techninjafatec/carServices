package com.mapbox.navigation.examples.preview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(300)
        setTheme(R.style.Theme_MapboxNavigationExamples)

        setContentView(R.layout.activity_home)

        val btn_alcoolGasolina = findViewById<Button>(R.id.btn_alcoolGasolina)
        val btn_map = findViewById<Button>(R.id.btn_map)

        btn_alcoolGasolina.setOnClickListener {
            AppAlcoolGasolina()
        }

        btn_map.setOnClickListener {
            AppMap()
        }
    }
    private fun AppAlcoolGasolina(){

        val alcoolGasolina = Intent(this,AlcoolGasolina::class.java)
        startActivity(alcoolGasolina)
    }

    private fun AppMap(){

        val map = Intent(this,MainActivity::class.java)
        startActivity(map)
    }
}