package com.example.philogram.main

import android.content.Intent

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.philogram.DetailActivity
import com.example.philogram.LoginActivity
import com.example.philogram.R
import com.example.philogram.TestValues.postItems
import com.example.philogram.UserManager

class MainActivity : AppCompatActivity() {
    private val imgUser by lazy {
        findViewById<ImageView>(R.id.img_user)
    }
    private val linearLayoutProfile by lazy {
        findViewById<LinearLayout>(R.id.linearLayout_profile)
    }
    private val linearLayoutPost by lazy {
        findViewById<LinearLayout>(R.id.linearLayout_post)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        addProfileItem()
        addPostItem()

        val userName = UserManager.currentUser?.name
        if (userName != null) {
            val welcomeText = "$userName 님 환영합니다"
            findViewById<TextView>(R.id.txt_main).text = welcomeText
        }
    }

    private fun initView() {
        imgUser.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun addProfileItem() {
        val profileItems = listOf(
            MainProfileItem(R.drawable.buddha_profile),
            MainProfileItem(R.drawable.nietzsche_profile),
            MainProfileItem(R.drawable.plato_profile),
            MainProfileItem(R.drawable.descartes_profile),
            MainProfileItem(R.drawable.go_profile)
        )

        for (item in profileItems) {
            val itemView = layoutInflater.inflate(R.layout.item_main_profile, null)
            val imgProfile = itemView.findViewById<ImageView>(R.id.img_profile)
            imgProfile.setImageResource(item.imgProfile)
            linearLayoutProfile.addView(itemView)

            imgProfile.setOnClickListener {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("idx", profileItems.indexOf(item).toString());

                startActivity(intent)
                overridePendingTransition(R.drawable.slide_right, R.drawable.slide_left);
            }
        }
    }

    private fun addPostItem() {
        for (item in postItems) {
            val itemView = layoutInflater.inflate(R.layout.item_main_post, null)
            val imtPostProfile = itemView.findViewById<ImageView>(R.id.img_post_profile)
            val txtPostUserName = itemView.findViewById<TextView>(R.id.txt_post_userName)
            val imgPostPicture = itemView.findViewById<ImageView>(R.id.img_post_picture)
            val txtPostContent = itemView.findViewById<TextView>(R.id.txt_post_content)
            val txtPostMore = itemView.findViewById<TextView>(R.id.txt_post_more)

            imtPostProfile.setImageResource(item.imgPostProfile)
            txtPostUserName.text = item.txtPostUserName
            imgPostPicture.setImageResource(item.imgPostPicture)
            txtPostContent.text = item.txtPostContent

            linearLayoutPost.addView(itemView)
        }
    }
}
