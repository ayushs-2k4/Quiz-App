package com.ayushsinghal.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayushsinghal.quizapp.databinding.ActivityQuizBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private lateinit var list: ArrayList<QuestionModel>
    private var count: Int = 0
    private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)


        list = ArrayList()

        Firebase.firestore.collection("quiz").get().addOnSuccessListener { doc ->
            list.clear()
            binding.linearProgressBar.setProgressCompat(100 / doc.size(), true)
            for (i in doc.documents) {
                val questionModel = i.toObject<QuestionModel>()
                list.add(questionModel!!)
            }

            binding.questionCountTextView.text = "Q. 1"
            binding.questionTextView.text = list[0].question
            binding.option1.text = list[0].option1
            binding.option2.text = list[0].option2
            binding.option3.text = list[0].option3
            binding.option4.text = list[0].option4
        }


        binding.option1.setOnClickListener() {
            nextData(1)
        }

        binding.option2.setOnClickListener() {
            nextData(2)
        }

        binding.option3.setOnClickListener() {
            nextData(3)
        }

        binding.option4.setOnClickListener() {
            nextData(4)
        }

        binding.logoutButton.setOnClickListener()
        {
            Firebase.auth.signOut()
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }

    }

    private fun nextData(selectedOption: Int) {
        if ((count < list.size) && (list[count].ans == selectedOption)) {
            score++
        }
        count++
        binding.linearProgressBar.setProgressCompat(100 * (count + 1) / list.size, true)
        if (count >= list.size) {
            val intent = Intent(this, ScoreActivity::class.java)
            intent.putExtra("SCORE", score)
            intent.putExtra("TOTAL_QUESTIONS", list.size)
            startActivity(intent)
            finish()
        } else {
            binding.questionCountTextView.text = "Q. ${count + 1}"
            binding.questionTextView.text = list[count].question
            binding.option1.text = list[count].option1
            binding.option2.text = list[count].option2
            binding.option3.text = list[count].option3
            binding.option4.text = list[count].option4
        }
    }
}