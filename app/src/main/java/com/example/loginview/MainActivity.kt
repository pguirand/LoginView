package com.example.loginview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginBtn : Button = findViewById(R.id.loginBtn)
        val userText : EditText = findViewById(R.id.userText)
        val userPass : EditText = findViewById(R.id.userPass)

        loginBtn.setOnClickListener {
            if (userText.text.isNotEmpty() && (userPass.text.isNotEmpty())) {
                val intent = Intent(this, HomeScreenActivity::class.java)
                    .putExtra("email", userText.text.toString())
                startActivity(intent)
                finish()

            } else {
                Toast.makeText(this,
                    "Please enter your credentials", Toast.LENGTH_LONG).show()
            }


        }
    }
}