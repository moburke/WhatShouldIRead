package com.example.whatshouldiread.ui.bookshelf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.whatshouldiread.R

class BookshelfFragment : Fragment() {

    private lateinit var bookshelfViewModel: BookshelfViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bookshelfViewModel =
            ViewModelProviders.of(this).get(BookshelfViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_bookshelf, container, false)
        bookshelfViewModel.text.observe(viewLifecycleOwner, Observer {})
        return root
    }
}