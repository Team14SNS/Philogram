package com.example.philogram

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate

class MyPageEditActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_page_edit)




    val btn_save = findViewById<Button>(R.id.btn_save)

        btn_save.setOnClickListener{
            Toast.makeText(this, "저장", Toast.LENGTH_SHORT).show()





        }
    }
}