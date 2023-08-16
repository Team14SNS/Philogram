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



//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
//        }
//       else {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY);
//        }

        setContentView(R.layout.activity_my_page_edit)


    val btn_save = findViewById<Button>(R.id.btn_save)

        btn_save.setOnClickListener{
            Toast.makeText(this, "저장", Toast.LENGTH_SHORT).show()

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) // 다크모드 활성화
        }
    }
}