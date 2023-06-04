package com.ayushsinghal.quizapp

class QuestionModel {
    lateinit var question: String
    lateinit var option1: String
    var option2: String? = null
    lateinit var option3: String
    lateinit var option4: String
    var ans: Int = 0

    constructor(
        question: String,
        option1: String,
        option2: String,
        option3: String,
        option4: String,
        ans: Int
    ) {
        this.question = question
        this.option1 = option1
        this.option2 = option2
        this.option3 = option3
        this.option4 = option4
        this.ans = ans
    }

    constructor()
}