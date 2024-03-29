package edu.upf.aism.betterguest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(null)
        val btn_Login = findViewById<Button>(R.id.Btn_L01)

        btn_Login.setOnClickListener {
            val intent = Intent(this, Activity_Login::class.java)
            startActivity(intent)
        }
        val btn_CheckIn = findViewById<Button>(R.id.Btn_CI01)

        btn_CheckIn.setOnClickListener {
            val intent = Intent(this, Activity_CheckIn::class.java)
            startActivity(intent)
        }
    }


}