package com.example.whatshouldiread.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        var initialQuestion = quiz.questions.get(0)
        txtQuestionText.text = initialQuestion.questionText
        btnAnswerA.text = initialQuestion.questionAnswer1
        btnAnswerB.text = initialQuestion.questionAnswer2

        btnAnswerA.setOnClickListener {
            quiz.answers.set(position, 0)
            position++
            var question = quiz.questions.get(position)
            txtQuestionText.text = question.questionText
            btnAnswerA.text = question.questionAnswer1
            btnAnswerB.text = question.questionAnswer2
        }
        btnAnswerB.setOnClickListener {
            quiz.answers.set(position, 1)
            position++
            var question = quiz.questions.get(position)
            txtQuestionText.text = question.questionText
            btnAnswerA.text = question.questionAnswer1
            btnAnswerB.text = question.questionAnswer2
        }
        return inflater.inflate(R.layout.quiz_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

}