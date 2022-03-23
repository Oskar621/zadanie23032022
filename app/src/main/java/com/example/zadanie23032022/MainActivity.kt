package com.example.zadanie23032022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zatwierdzkom = findViewById<Button>(R.id.zatwierdz)
        val cofnijkom = findViewById<Button>(R.id.odblokuj)
        val number = findViewById<EditText>(R.id.Wiek)
        val plecm = findViewById<RadioButton>(R.id.mezczyzna)
        val pleck = findViewById<RadioButton>(R.id.kobieta)
        val gry = findViewById<RadioButton>(R.id.Gry)
        val sport = findViewById<RadioButton>(R.id.sport)
        val turystyka = findViewById<RadioButton>(R.id.turystyka)
        val muzyka = findViewById<RadioButton>(R.id.muzyka)
        var wynik = ""
        var wiek = 0
        zatwierdzkom.setOnClickListener {
            plecm.isEnabled = false
            pleck.isEnabled = false
            number.isEnabled = false
            if(plecm.isChecked)
            {
                wynik += "Mezczyzna, "
            }

            if(pleck.isChecked)
            {
                wynik += "Kobieta, "
            }
            wiek = number.text
            wynik += wiek
            if(plecm.isChecked)
            {
                wynik += "Mezczyzna, "
            }

            if(plecm.isChecked)
            {
                wynik += "Mezczyzna, "
            }

            if(plecm.isChecked)
            {
                wynik += "Mezczyzna, "
            }

            if(plecm.isChecked)
            {
                wynik += "Mezczyzna, "
            }

        }
        cofnijkom.setOnClickListener {
            plecm.isEnabled = true
            pleck.isEnabled = true
            number.isEnabled = true
        }
    }
}