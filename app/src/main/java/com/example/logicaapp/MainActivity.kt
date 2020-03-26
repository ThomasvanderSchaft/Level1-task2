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

        //assign standard value to the amount of correct answers
        var correctAnswers = 0

        //hardcoded statement to check if answers are correct
        if (etAnswerOne.text.toString() == "T"){

            //adding one point to the amount of correct answers if statement is true
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

        //create toast message with amount of correct answers value
        Toast.makeText(this@MainActivity,getString(R.string.correct, correctAnswers), Toast.LENGTH_LONG).show()
    }
}
