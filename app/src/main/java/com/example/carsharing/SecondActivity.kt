package com.example.carsharing

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private var answer:Int = 0
    private lateinit var fullAnswer: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        answer = intent.getIntExtra(EXTRA, 0)
        fullAnswer.text = "Оплатить = $answer рублей"
    }

    companion object {
        fun newIntent(packageContext: Context, answer: Int): Intent {
            return Intent(packageContext, SecondActivity::class.java).apply {
                putExtra(EXTRA, answer)
            }
        }
    }
}