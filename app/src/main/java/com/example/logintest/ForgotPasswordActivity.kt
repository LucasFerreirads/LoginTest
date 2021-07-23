package com.example.logintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class ForgotPasswordActivity : AppCompatActivity() {

    private var error:Boolean?=null
    private lateinit var editEmail:EditText
    private lateinit var btnFinish:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        editEmail=findViewById(R.id.editForgot)
        btnFinish=findViewById(R.id.btnFinish)

        btnFinish.setOnClickListener {
            if(error!=true)
            {
                editEmail.setBackgroundResource(R.drawable.background_buttton_error)
            }
            else{
            Toast.makeText(this, "Enviando email",Toast.LENGTH_SHORT).show()
            }
        }
    }
}