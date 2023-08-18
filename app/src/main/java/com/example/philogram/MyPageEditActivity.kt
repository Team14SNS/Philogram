package com.example.philogram

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate



class MyPageEditActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_my_page_edit)

        val currentUser = UserManager.currentUser
        val currentNickname = currentUser?.nickname ?: ""
        val currentNation = currentUser?.nation ?: ""
        val currentIntro = currentUser?.intro ?: ""

        val edt_nickname = findViewById<EditText>(R.id.edt_nickname)
        edt_nickname.setText(currentNickname)

        val edt_nation = findViewById<EditText>(R.id.edt_nation)
        edt_nation.setText(currentNation)

        val edt_intro = findViewById<EditText>(R.id.edt_intro)
        edt_intro.setText(currentIntro)

        val btn_save = findViewById<Button>(R.id.btn_save)

        val btn_back = findViewById<ImageButton>(R.id.btn_back)

        btn_back.setOnClickListener{
            finish()
        }

        btn_save.setOnClickListener{
            Toast.makeText(this, getString(R.string.edit_save_btn), Toast.LENGTH_SHORT).show()

            val newNickname = edt_nickname.text.toString()
            val newNation = edt_nation.text.toString()
            val newIntro = edt_intro.text.toString()

            if(currentUser !=null) {
                currentUser.nickname = newNickname
                currentUser.nation = newNation
                currentUser.intro = newIntro
            }

            UserManager.currentUser = currentUser

            edt_nickname.setText(newNickname)
            edt_nation.setText(newNation)
            edt_intro.setText(newIntro)

            finish()
        }
    }
}