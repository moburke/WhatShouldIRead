package com.example.whatshouldiread.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.whatshouldiread.R

class HomeFragment : Fragment() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainViewModel =
            ViewModelProviders.of(this).get(MainViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        mainViewModel.text.observe(viewLifecycleOwner, Observer {})
        return root
    }
}