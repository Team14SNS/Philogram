package com.example.philogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_main_post)


        val textPostUserName = findViewById<TextView>(R.id.txt_post_userName)
        val txtPostContent = findViewById<TextView>(R.id.txt_post_content)
        val imgPostProfile = findViewById<ImageView>(R.id.img_post_profile)
        val imgPostPicture = findViewById<ImageView>(R.id.img_post_picture)

        val intent = intent

        textPostUserName.text = intent.getStringExtra("name")
        txtPostContent.text = intent.getStringExtra("context")
    }
}