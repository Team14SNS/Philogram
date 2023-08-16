package com.example.philogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        findViewById<Button>(R.id.btn_signup).setOnClickListener {
            val id = findViewById<EditText>(R.id.edt_id).text.toString()
            val pw = findViewById<EditText>(R.id.edt_pw).text.toString()
            val name = findViewById<EditText>(R.id.edt_name).text.toString()
            val nickname = findViewById<EditText>(R.id.edt_nickname).text.toString()
            if (UserManager.isUserExist(id)) {
                Toast.makeText(this, "이미 존재하는 아이디입니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val newUser = User(id, name, nickname, pw)
            UserManager.addUser(newUser)

            Toast.makeText(this, "회원가입 성공!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}