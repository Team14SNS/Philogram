package com.example.philogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout_post)

        val postItems = listOf(
            PostItem(R.drawable.ic_main_user, "User 1", R.drawable.logo_black, "Sample Content 1"),
            PostItem(R.drawable.ic_main_user, "User 2", R.drawable.logo_black, "Sample Content 2"),
            PostItem(R.drawable.ic_main_user, "User 3", R.drawable.logo_black, "Sample Content 3"),
            PostItem(R.drawable.ic_main_user, "User 4", R.drawable.logo_black, "Sample Content 4"),
            PostItem(R.drawable.ic_main_user, "User 5", R.drawable.logo_black, "Sample Content 5"),
            PostItem(R.drawable.ic_main_user, "User 6", R.drawable.logo_black, "Sample Content 6"),
            PostItem(R.drawable.ic_main_user, "User 7", R.drawable.logo_black, "Sample Content 7"),
        )

        for(item in postItems) {
            val itemView = layoutInflater.inflate(R.layout.item_main_post, null)
            val imtPostProfile = itemView.findViewById<ImageView>(R.id.img_post_profile)
            val txtPostUserName = itemView.findViewById<TextView>(R.id.txt_post_userName)
            val imgPostPicture = itemView.findViewById<ImageView>(R.id.img_post_picture)
            val txtPostContent = itemView.findViewById<TextView>(R.id.txt_post_content)

            imtPostProfile.setImageResource(item.imgPostProfile)
            txtPostUserName.text = item.txtPostUserName
            imgPostPicture.setImageResource(item.imgPostPicture)
            txtPostContent.text = item.txtPostContent

            linearLayout.addView(itemView)
        }
    }
}