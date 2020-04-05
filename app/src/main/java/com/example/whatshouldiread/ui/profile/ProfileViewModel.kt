package com.example.whatshouldiread.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    ...
    handleIntent(intent)
}

override fun onNewIntent(intent: Intent) {
    super.onNewIntent(intent)
    handleIntent(intent)
}

private fun handleIntent(intent: Intent) {
    val appLinkAction = intent.action
    val appLinkData: Uri? = intent.data
    if (Intent.ACTION_VIEW == appLinkAction) {
        appLinkData?.lastPathSegment?.also { recipeId ->
            Uri.parse("content://com.recipe_app/recipe/")
                .buildUpon()
                .appendPath(recipeId)
                .build().also { appData ->
                    showRecipe(appData)
                }
        }
    }
}