package com.example.philogram

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginFindPwActivity : AppCompatActivity() {

    private var isIdChecked: Boolean = false // 아이디가 확인되었는지를 판단
    private var currentUserId: String? = null // 현재 확인된 아이디 저장
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_find_pw)

        val edtInput = findViewById<EditText>(R.id.edt_input)
        val btnAction = findViewById<Button>(R.id.btn_action)

        btnAction.setOnClickListener {
            if(!isIdChecked) {
                val userId = edtInput.text.toString()
                if(UserManager.isUserExist(userId)) {
                    isIdChecked = true
                    currentUserId = userId // 아이디 저장
                    edtInput.text.clear()
                    edtInput.hint = "새 비밀번호 입력"
                    edtInput.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD // 비밀번호 입력 타입으로 변경
                    btnAction.text = "비밀번호 변경"
                }else {
                    Toast.makeText(this, "일치하는 아이디가 없습니다.", Toast.LENGTH_SHORT).show()
                }
            }else {
                val newPw = edtInput.text.toString()
                UserManager.resetPw(currentUserId!!, newPw) // 저장된 아이디 사용
                Toast.makeText(this, "비밀번호가 변경되었습니다.", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        val txtAction = findViewById<TextView>(R.id.txt_go_login)
        txtAction.setOnClickListener {
            finish()
        }
    }
}