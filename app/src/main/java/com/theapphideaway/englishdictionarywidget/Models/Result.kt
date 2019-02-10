package com.theapphideaway.englishdictionarywidget.Models

data class Result(
    var definition: String,
    var derivation: List<String>,
    var examples: List<String>,
    var hasTypes: List<String>,
    var partOfSpeech: String,
    var synonyms: List<String>,
    var typeOf: List<String>
)