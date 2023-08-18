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
                Toast.makeText(this, getString(R.string.signup_no_enter_info_toast), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (UserManager.isUserExist(id)) {
                Toast.makeText(this, getString(R.string.signup_exist_id_toast), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val newUser = User(id, pw, name, nickname)
            UserManager.addUser(newUser)

            Toast.makeText(this, getString(R.string.signup_signup_success), Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}