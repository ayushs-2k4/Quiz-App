package com.ayushsinghal.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import com.ayushsinghal.quizapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linearProgressBar.isVisible = false

        binding.button.setOnClickListener()
        {
            if ((binding.email.editText?.text.toString() == "") || (binding.password.editText?.text.toString() == "")) {
                Toast.makeText(this, "Email and Password can not be empty", Toast.LENGTH_SHORT)
                    .show()
            } else {
                binding.linearProgressBar.isVisible = true
                Firebase.auth.signInWithEmailAndPassword(
                    binding.email.editText?.text.toString(),
                    binding.password.editText?.text.toString()
                ).addOnCompleteListener() {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Logged in successfully", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, QuizActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this, it.exception?.message.toString(), Toast.LENGTH_SHORT)
                            .show()
                    }
                    binding.linearProgressBar.isVisible = false
                }
            }
        }

        binding.signUpInsteadButton.setOnClickListener() {
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }
    }
}