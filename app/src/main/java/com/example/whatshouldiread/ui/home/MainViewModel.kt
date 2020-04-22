package com.example.whatshouldiread.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}

//Here, a method could be added from the viewModel

class MyViewModel : ViewModel() {
    private val users: MutableLiveData<List<User>> by lazy {
        MutableLiveData().also {
            loadUsers()
        }
    }

    fun getUsers(): LiveData<List<User>> {
        return users
    }

    private fun loadUsers() {
        // Do an asynchronous operation to fetch users.
    }
}

override fun onCreate(savedInstanceState: Bundle?) {
    // Create a ViewModel the first time the system calls an activity's onCreate() method.
    // Re-created activities receive the same MyViewModel instance created by the first activity.

    // Use the 'by viewModels()' Kotlin property delegate
    // from the activity-ktx artifact
    val model: MyViewModel by viewModels()
    model.getUsers().observe(this, Observer<List<User>>{ users ->
        // update UI
    })
}
}