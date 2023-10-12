package com.example.carsharing

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.content.Intent
import android.widget.TextView

private const val EXTRA = "com.example.carsharing.main_answer"
class SecondActivity : AppCompatActivity() {
    private var answer = 0
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
    override fun onStart() {
        super.onStart()
    }
    override fun onResume() {
        super.onResume()
    }
    override fun onPause() {
        super.onPause()
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle)
    {
        super.onSaveInstanceState(savedInstanceState)
    }

    override fun onStop() {
        super.onStop()
    }
    override fun onDestroy() {
        super.onDestroy()
    }
}