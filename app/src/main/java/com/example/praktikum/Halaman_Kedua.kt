package com.example.praktikum

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Halaman_Kedua : AppCompatActivity() {

    var btn : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_halaman_kedua)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn = findViewById(R.id.buttonNext)

        btn?.setOnClickListener() {
            val i = Intent(this, Calculator::class.java)
            startActivity(i)
        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("Memanggil Callback", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Memanggil Callback", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Memanggil Callback", "onStop")

    }
}




