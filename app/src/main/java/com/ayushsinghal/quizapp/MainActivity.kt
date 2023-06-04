package com.ayushsinghal.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.core.os.postDelayed
import com.ayushsinghal.quizapp.databinding.ActivityMainBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed(1800)
        {
            if (Firebase.auth.currentUser != null) {
                val intent = Intent(this, QuizActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, SignUpActivity::class.java)
                intent.putExtra("MODE", "SIGNUP")
                startActivity(intent)
            }
            finish()
        }
    }
}