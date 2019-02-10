package com.theapphideaway.englishdictionarywidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.theapphideaway.englishdictionarywidget.Services.DictionaryService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dictionaryService = DictionaryService()

        GlobalScope.launch(Dispatchers.Main) {

            var definition = dictionaryService.getHeadlineApi().getSpecificHeadlines().await()

            println(definition)
        }
    }
}
