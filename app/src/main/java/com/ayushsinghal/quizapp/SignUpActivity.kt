package com.ayushsinghal.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import com.ayushsinghal.quizapp.databinding.ActivitySignUpBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linearProgressBar.isVisible = false

        binding.button.setOnClickListener()
        {
            if ((binding.email.editText?.text.toString() == "") || (binding.password.editText?.text.toString() == "")) {
                Toast.makeText(this, "Email and Password can not be empty", Toast.LENGTH_SHORT)
                    .show()
            } else {
                binding.linearProgressBar.isVisible = true
                Firebase.auth.createUserWithEmailAndPassword(
                    binding.email.editText?.text.toString(),
                    binding.password.editText?.text.toString()
                ).addOnCompleteListener() {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "User Created!", Toast.LENGTH_SHORT).show()
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

        binding.loginInsteadButton.setOnClickListener() {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}