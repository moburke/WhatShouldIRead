package com.example.whatshouldiread.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.whatshouldiread.R
import com.example.whatshouldiread.customclasses.Quiz
import java.util.*

class QuizActivity : AppCompatActivity(){

    var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_fragment)

        var quiz = Quiz()
        var rand = Random()
        var variation = rand.nextInt(1)

        for (x in 0 until 5)
        {
            var input = assets.open("data/questions/$x/$variation.txt")
            quiz.addQuestion(input, x)
        }

        var initialQuestion = quiz.questions[0]

        var txtView = findViewById<TextView>(R.id.txtQuestionText)
        var btnA = findViewById<Button>(R.id.btnAnswerA)
        var btnB = findViewById<Button>(R.id.btnAnswerB)

        txtView.text = initialQuestion.questionText
        btnA.text = initialQuestion.questionAnswer1
        btnB.text = initialQuestion.questionAnswer2

        btnA.setOnClickListener {
            quiz.answers[position] = 0
            position++
            var question = quiz.questions[position]
            txtView.text = question.questionText
            btnA.text = question.questionAnswer1
        }
        btnB.setOnClickListener {
            quiz.answers[position] = 1
            position++
            var question = quiz.questions[position]
            txtView.text = question.questionText
            btnA.text = question.questionAnswer1
            btnB.text = question.questionAnswer2
        }
    }
}
