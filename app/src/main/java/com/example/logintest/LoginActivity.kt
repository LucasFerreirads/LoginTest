package com.example.logintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var btnEntrar:Button
    private lateinit var textLoginEsqueci:TextView
    private lateinit var textLoginCadastrar:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnEntrar=findViewById(R.id.btnLoginEntrar)
        textLoginEsqueci=findViewById(R.id.textLoginEsqueci)
        textLoginCadastrar=findViewById(R.id.textLoginCadastrar)

        btnEntrar.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        textLoginCadastrar.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }

        textLoginEsqueci.setOnClickListener {
            startActivity(Intent(this,ForgotPasswordActivity::class.java))
        }
    }
}