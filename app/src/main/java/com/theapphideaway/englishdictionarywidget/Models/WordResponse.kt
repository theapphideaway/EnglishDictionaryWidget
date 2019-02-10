package com.theapphideaway.englishdictionarywidget.Models

data class WordResponse(
    var frequency: Double,
    var pronunciation: Pronunciation,
    var results: List<Result>,
    var syllables: Syllables,
    var word: String
)