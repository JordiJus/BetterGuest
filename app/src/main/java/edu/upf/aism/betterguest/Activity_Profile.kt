package edu.upf.aism.betterguest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(null)
        val btn_Home = findViewById<Button>(R.id.Btn_H02)

        btn_Home.setOnClickListener {
            val intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
        }

        val btn_Profile = findViewById<Button>(R.id.Btn_P02)

        btn_Profile.setOnClickListener {
            val intent = Intent(this, Activity_Profile::class.java)
            startActivity(intent)
        }

        val btn_Config = findViewById<Button>(R.id.Btn_Config01)

        btn_Config.setOnClickListener {
            val intent = Intent(this, Activity_Config::class.java)
            startActivity(intent)
        }
    }
}