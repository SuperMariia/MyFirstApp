package com.Mariia.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

lateinit var plusButton: Button
lateinit var minusButton: Button
lateinit var multiplicationButton: Button
lateinit var historyButton: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton = findViewById(R.id.plus_button)
        plusButton.setOnClickListener { }


        historyButton = findViewById(R.id.history_button)
        historyButton.setOnClickListener {
            val secondActivityIntent: Intent = Intent(this, SecondActivityHistory::class.java)
            startActivity(secondActivityIntent)
        }

    }

}