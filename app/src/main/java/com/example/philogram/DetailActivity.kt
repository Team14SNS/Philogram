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
        setContentView(R.layout.activity_detail)

        val txtUserName = findViewById<TextView>(R.id.txt_username)

        txtUserName.setOnClickListener {
            showFeedDialog()
            setContentView(R.layout.activity_main)
        }
        val txtEdit = findViewById<TextView>(R.id.txt_edit)

        txtEdit.setOnClickListener {
            startActivity(Intent(this@DetailActivity, MyPageEditActivity::class.java))
        }

    }

    fun showFeedDialog() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.feed_dialog, null)

        val dialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)

        val alertDialog = dialogBuilder.create()
        alertDialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val dialog_btn = dialogView.findViewById<Button>(R.id.dialog_btn)
        dialog_btn.setOnClickListener {
            alertDialog.dismiss()
        }
        alertDialog.show()
    }
}