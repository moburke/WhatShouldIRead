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
        return inflater.inflate(R.layout.quiz_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

}