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
            val id = findViewById<EditText>(R.id.edt_id).text.toString().trim()
            val pw = findViewById<EditText>(R.id.edt_pw).text.toString().trim()
            val name = findViewById<EditText>(R.id.edt_name).text.toString().trim()
            val nickname = findViewById<EditText>(R.id.edt_nickname).text.toString().trim()

            if (id.isEmpty() || pw.isEmpty() || name.isEmpty() || nickname.isEmpty()) {
                Toast.makeText(this, "입력하지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (UserManager.isUserExist(id)) {
                Toast.makeText(this, "이미 존재하는 아이디입니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val newUser = User(id, pw, name, nickname)
            UserManager.addUser(newUser)

            Toast.makeText(this, "회원가입 성공!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}