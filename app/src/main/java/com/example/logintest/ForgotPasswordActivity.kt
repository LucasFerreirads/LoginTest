package com.example.logintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ForgotPasswordActivity : AppCompatActivity() {

    private var error: Boolean? = null
    private lateinit var editEmail: EditText
    private lateinit var btnFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        editEmail = findViewById(R.id.editForgot)
        btnFinish = findViewById(R.id.btnFinish)

        btnFinish.setOnClickListener {
            if (error == false)
            {
                editEmail.setBackgroundResource(R.drawable.background_buttton_error)
            }
            else
            {
                startActivity(Intent(this, LoginActivity::class.java))
                Toast.makeText(this, "email enviado", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
}