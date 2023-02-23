package edu.upf.aism.betterguest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity_QR : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr)

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setBackgroundDrawable(null)
        val btn_QR = findViewById<Button>(R.id.Btn_B03)

        // 为按钮添加点击事件
        btn_QR.setOnClickListener {
            val intent = Intent(this, Activity_Home::class.java)
            startActivity(intent)
        }
    }
}