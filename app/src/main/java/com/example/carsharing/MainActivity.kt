package com.example.carsharing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton



class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var colH: EditText
    private var moneyCar: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        colH = findViewById(R.id.editText)


        findViewById<RadioButton>(R.id.radioButton).setOnCheckedChangeListener { _ , isChecked ->
            if (isChecked)
                moneyCar = 2000
        }
        findViewById<RadioButton>(R.id.radioButton2).setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                moneyCar = 2500
        }
        findViewById<RadioButton>(R.id.radioButton3).setOnCheckedChangeListener { _, isChecked ->
            if (isChecked)
                moneyCar = 3500
        }

        button.setOnClickListener {
            val answer:Int = moneyCar * Integer.parseInt(colH.text.toString().trim())
            val intent = SecondActivity.newIntent(this@MainActivity, answer)
            startActivity(intent)
        }

    }
}
