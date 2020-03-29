package com.example.whatshouldiread.ui.home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.whatshouldiread.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_bookshelf,
                R.id.navigation_profile
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //btn_start_quiz.setOnClickListener{
          //  val intent = Intent(this, QuizFragment::class.java)
            //startActivity(intent)
        //}

        val btnStartQuizActivity: Button = findViewById(R.id.btn_start_quiz)
        btnStartQuizActivity.setOnClickListener {
            val intent = Intent(this, QuizVersion2Activity:: class.java)
            startActivity(intent)

        }
    }
}

