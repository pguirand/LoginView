package com.example.loginview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class HomeScreenActivity : AppCompatActivity() {

    private var gCurrentPos: Int = 1
    private var gQuestionList:ArrayList<Question>?=null
    private var gSelectedOptionPos : Int = 0


    private var progressBar: ProgressBar? = null
    private var textProgress : TextView? = null
    private var textQuestion : TextView? = null
    private var radioGroup : RadioGroup? = null
    private var radioButton1 : RadioButton? = null
    private var radioButton2 : RadioButton? = null
    private var radioButton3 : RadioButton? = null
    private var radioButton4 : RadioButton? = null
    private var submitBtn : Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        progressBar = findViewById(R.id.progressBar)
        textProgress = findViewById(R.id.textProgress)
        textQuestion = findViewById(R.id.textQuestion)
//        radioGroup = findViewById(R.id.radioGroupAll)
        radioButton1 = findViewById(R.id.rbOptionOne)
        radioButton2 = findViewById(R.id.rbOptionTwo)
        radioButton3 = findViewById(R.id.rbOptionThree)
        radioButton4 = findViewById(R.id.rbOptionFour)
        submitBtn = findViewById(R.id.submitBtn)

        gQuestionList = Constants.getQuestions()

        setQuestion()

        submitBtn?.setOnClickListener {
            gCurrentPos++
            when {
                gCurrentPos <= gQuestionList!!.size -> setQuestion()
            }
        }
    }

    private fun setQuestion() {

        val question: Question = gQuestionList!![gCurrentPos - 1]

        progressBar?.progress = gCurrentPos
        textProgress?.text = "$gCurrentPos/${progressBar?.max}"
        textQuestion?.text = question.questionAsked
        radioButton1?.text = question.optionOne
        radioButton2?.text = question.optionTwo
        radioButton3?.text = question.optionThree
        radioButton4?.text = question.optionFour

        if (gCurrentPos == gQuestionList!!.size) {
            submitBtn?.text = "FINISH"
        } else {
            submitBtn?.text = "NEXT"
        }
    }
}