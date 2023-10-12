package com.example.carsharing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

const val EXTRA = "com.example.carsharing.extra"

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var colH: EditText
    private var moneyCar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        colH = findViewById(R.id.editText)


        findViewById<RadioButton>(R.id.radioButton).setOnCheckedChangeListener { _, _ ->
            moneyCar = 2000
        }
        findViewById<RadioButton>(R.id.radioButton2).setOnCheckedChangeListener { _, _ ->
            moneyCar = 2500
        }
        findViewById<RadioButton>(R.id.radioButton3).setOnCheckedChangeListener { _, _ ->
            moneyCar = 3500
        }

        button.setOnClickListener {
            val answer = moneyCar * Integer.parseInt(colH.getText().toString().trim())
            val intent = SecondActivity.newIntent(this@MainActivity, answer)
            startActivity(intent)
        }

    }
    override fun onStart() {
        super.onStart()
    }
}

