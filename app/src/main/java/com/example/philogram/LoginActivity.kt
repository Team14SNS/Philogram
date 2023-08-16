package com.example.philogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val txtSignUp = findViewById<TextView>(R.id.txt_signup)
        txtSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.drawable.slide_right, R.drawable.slide_left);
        }

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            val id = findViewById<EditText>(R.id.edit_id).text.toString()
            val pw = findViewById<EditText>(R.id.edit_pw).text.toString()

            if (UserManager.loginUser(id, pw)) {
                Toast.makeText(this, "로그인 성공!", Toast.LENGTH_SHORT).show()
                // 로그인 성공 후의 동작 (예: 메인 화면으로 이동) 구현
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "아이디 또는 비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}