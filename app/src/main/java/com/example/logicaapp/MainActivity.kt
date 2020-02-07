package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener {
            println("Hallo")
            check()
        }
    }
    fun check(){
        var correctAnswers = 0
        if (etAnswerOne.text.toString() == "T"){
            correctAnswers++
        }
        if (etAnswerTwo.text.toString() == "F"){
            correctAnswers++
        }
        if (etAnswerThree.text.toString() == "F"){
            correctAnswers++
        }
        if (etAnswerFour.text.toString() == "F"){
            correctAnswers++
        }
        Toast.makeText(this@MainActivity,getString(R.string.correct, correctAnswers), Toast.LENGTH_LONG).show()
    }
}
