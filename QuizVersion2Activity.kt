package com.example.whatshouldiread.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.whatshouldiread.R

class QuizVersion2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_version2)

        val txtTest : TextView = findViewById(R.id.txtTest)
        txtTest.setText("This is a test for the Quiz activity")
    }
}
