package edu.upf.aism.betterguest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(null)
        val btn_QR = findViewById<Button>(R.id.Btn_QR01)

        btn_QR.setOnClickListener {
            val intent = Intent(this, Activity_QR::class.java)
            startActivity(intent)
        }

        val btn_Home = findViewById<Button>(R.id.Btn_H01)

        btn_Home.setOnClickListener {
            val intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
        }

        val btn_Profile = findViewById<Button>(R.id.Btn_P01)

        btn_Profile.setOnClickListener {
            val intent = Intent(this, Activity_Profile::class.java)
            startActivity(intent)
        }
    }
}