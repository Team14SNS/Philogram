package com.example.philogram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val edit_txt = findViewById<TextView>(R.id.edit_txt)

        edit_txt.setOnClickListener {
            showFeedDialog()
            setContentView(R.layout.activity_main)

            val btnLogin = findViewById<Button>(R.id.goLogin)
            btnLogin.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }

    fun showFeedDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.feed_dialog, null)

        val dialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)

        val alertDialog = dialogBuilder.create()
        alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val dialog_btn = dialogView.findViewById<Button>(R.id.dialog_btn) // dialogView에서 버튼을 찾음
        dialog_btn.setOnClickListener {
            alertDialog.dismiss()
        }
        alertDialog.show()
    }
}