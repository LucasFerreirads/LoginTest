package com.example.logintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {

    private lateinit var btnCadastrar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        btnCadastrar=findViewById(R.id.btnCadastroCadastrar)

        btnCadastrar.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}