package edu.upf.aism.betterguest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Config : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(null)

        val btn_Back = findViewById<Button>(R.id.Btn_B04)

        btn_Back.setOnClickListener {
            val intent = Intent(this, Activity_Profile::class.java)
            startActivity(intent)
        }

        val btn_Home = findViewById<Button>(R.id.Btn_H03)

        btn_Home.setOnClickListener {
            val intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
        }

        val btn_Profile = findViewById<Button>(R.id.Btn_P03)

        btn_Profile.setOnClickListener {
            val intent = Intent(this, Activity_Profile::class.java)
            startActivity(intent)
        }
    }
}