package edu.upf.aism.betterguest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(null)
        val btn_Back = findViewById<Button>(R.id.Btn_B03)

        btn_Back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val btn_Login = findViewById<Button>(R.id.Btn_L02)

        btn_Login.setOnClickListener {
            val intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
        }
    }
}