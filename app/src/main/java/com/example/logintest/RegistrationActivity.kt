package com.example.logintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {

    private lateinit var btnCadastrar:Button
    private lateinit var textMenu:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        btnCadastrar=findViewById(R.id.btnCadastroCadastrar)
        textMenu=findViewById(R.id.MenuRegisterLogin)


        btnCadastrar.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            Toast.makeText(this, "Conta criada", Toast.LENGTH_SHORT).show()
            finish()
        }

        textMenu.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
    }
}