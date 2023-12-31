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

        val txtFindPw = findViewById<TextView>(R.id.txt_findPw)
        txtFindPw.setOnClickListener {
            val intent = Intent(this, LoginFindPwActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn_login).setOnClickListener {
            val id = findViewById<EditText>(R.id.edit_id).text.toString()
            val pw = findViewById<EditText>(R.id.edit_pw).text.toString()

            if (UserManager.loginUser(id, pw)) {
                Toast.makeText(this, getString(R.string.login_login_success_toast), Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, getString(R.string.login_login_fail_toast), Toast.LENGTH_SHORT).show()
            }
        }
    }
}