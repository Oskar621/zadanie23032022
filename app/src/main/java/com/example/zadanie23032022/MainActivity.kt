package com.example.zadanie23032022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zatwierdzkom = findViewById<Button>(R.id.zatwierdz)
        val cofnijkom = findViewById<Button>(R.id.odblokuj)
        val number = findViewById<EditText>(R.id.Wiek)
        val plecm = findViewById<RadioButton>(R.id.mezczyzna)
        val pleck = findViewById<RadioButton>(R.id.kobieta)
        val gry = findViewById<CheckBox>(R.id.gry)
        val sport = findViewById<CheckBox>(R.id.sport)
        val turystyka = findViewById<CheckBox>(R.id.turystyka)
        val muzyka = findViewById<CheckBox>(R.id.muzyka)
        var wynik = ""
        zatwierdzkom.setOnClickListener {
            plecm.isEnabled = false
            pleck.isEnabled = false
            number.isEnabled = false
            gry.isEnabled = false
            sport.isEnabled = false
            turystyka.isEnabled = false
            muzyka.isEnabled = false
            if(plecm.isChecked)
            {
                wynik += "Mezczyzna, "
            }

            if(pleck.isChecked)
            {
                wynik += "Kobieta, "
            }
            val wiek = number.text.toString().toInt()
            wynik =wynik +  wiek.toString() + "lat, Zainteresowania:  "
            if(gry.isChecked)
            {
                wynik += "Gry, "
            }

            if(sport.isChecked)
            {
                wynik += "Sport, "
            }

            if(turystyka.isChecked)
            {
                wynik += "Turystyka, "
            }

            if(muzyka.isChecked)
            {
                wynik += "Muzyka"
            }
            wynik = wynik + "."
            Toast.makeText(applicationContext, wynik,Toast.LENGTH_SHORT).show()
            wynik = ""
        }
        cofnijkom.setOnClickListener {
            plecm.isEnabled = true
            pleck.isEnabled = true
            number.isEnabled = true
            gry.isEnabled = false
            sport.isEnabled = false
            turystyka.isEnabled = false
            muzyka.isEnabled = false
        }
    }
}