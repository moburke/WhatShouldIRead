package com.example.whatshouldiread.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.whatshouldiread.R
import com.example.whatshouldiread.customclasses.Quiz
import kotlinx.android.synthetic.main.quiz_fragment.*

class QuizFragment : Fragment() {

    companion object {
        fun newInstance() = QuizFragment()
    }

    private lateinit var viewModel: MainViewModel
    private var quiz = Quiz()
    private var position = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        var view = inflater.inflate(R.layout.quiz_fragment, container, false)
        var initialQuestion = quiz.questions.get(0)

        var txtView = view.findViewById<TextView>(R.id.txtQuestionText)
        var btnA = view.findViewById<Button>(R.id.btnAnswerA)
        var btnB = view.findViewById<Button>(R.id.btnAnswerB)

        txtView.text = initialQuestion.questionText
        btnA.text = initialQuestion.questionAnswer1
        btnB.text = initialQuestion.questionAnswer2

        btnB.setOnClickListener {
            quiz.answers.set(position, 0)
            position++
            var question = quiz.questions.get(position)
            txtView.text = question.questionText
            btnA.text = question.questionAnswer1
            btnAnswerB.text = question.questionAnswer2
        }
        btnB.setOnClickListener {
            quiz.answers.set(position, 1)
            position++
            var question = quiz.questions.get(position)
            txtView.text = question.questionText
            btnA.text = question.questionAnswer1
            btnB.text = question.questionAnswer2
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

}