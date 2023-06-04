package com.ayushsinghal.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayushsinghal.quizapp.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("SCORE", -1)
        val totalQuestions = intent.getIntExtra("TOTAL_QUESTIONS", -1)

        binding.scoreTextView.text = "$score / $totalQuestions"
    }
}