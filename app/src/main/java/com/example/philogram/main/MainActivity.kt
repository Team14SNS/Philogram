package com.example.philogram.main

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.philogram.DetailActivity
import com.example.philogram.LoginActivity
import com.example.philogram.R
import com.example.philogram.TestValues
import com.example.philogram.TestValues.postItems
import com.example.philogram.TestValues.sortByDate
import com.example.philogram.UserManager

@RequiresApi(Build.VERSION_CODES.O)
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
    }

    override fun onResume() {
        super.onResume()
        val userName = UserManager.currentUser?.name
        if (userName != null) {
            val welcomeText = "$userName 님 환영합니다"
            findViewById<TextView>(R.id.txt_main).text = welcomeText
        }
    }

    private fun initView() {
        imgUser.setOnClickListener {
            if (UserManager.currentUser?.name != null) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("idx", "5")
                startActivity(intent)
                overridePendingTransition(R.drawable.slide_right, R.drawable.slide_left);
            } else {
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            }
        }
    }

    private fun addProfileItem() {
        val profileItems = listOf(
            MainProfileItem(R.drawable.buddha_profile),
            MainProfileItem(R.drawable.nietzsche_profile),
            MainProfileItem(R.drawable.plato_profile),
            MainProfileItem(R.drawable.descartes_profile),
            MainProfileItem(R.drawable.confucius_profile)
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
        sortByDate()
        for (item in postItems) {
            val itemView = layoutInflater.inflate(R.layout.item_main_post, null)
            val imtPostProfile = itemView.findViewById<ImageView>(R.id.img_post_profile)
            val txtPostUserName = itemView.findViewById<TextView>(R.id.txt_post_userName)
            val imgPostHeart = itemView.findViewById<ImageView>(R.id.img_post_heart)
            val imgPostPicture = itemView.findViewById<ImageView>(R.id.img_post_picture)
            val txtPostContent = itemView.findViewById<TextView>(R.id.txt_post_content)
            val txtPostMore = itemView.findViewById<TextView>(R.id.txt_post_more)
            val txtPostDate = itemView.findViewById<TextView>(R.id.txt_post_date)

            imtPostProfile.setImageResource(item.imgPostProfile)
            txtPostUserName.text = item.txtPostUserName
            var isHeart = false
            imgPostHeart.setOnClickListener {
                if (isHeart) {
                    imgPostHeart.setImageResource(R.drawable.ic_empty_heart)
                    isHeart = false
                } else {
                    imgPostHeart.setImageResource(R.drawable.ic_full_heart)
                    isHeart = true
                }
            }
            imgPostPicture.setImageResource(item.imgPostPicture)
            txtPostContent.text = item.txtPostContent

            // 포스팅 날짜 설정...
            txtPostDate.text = TestValues.getPostingDate(item)

            var isTxtMore = false
            txtPostMore.setOnClickListener {
                if (isTxtMore) {
                    txtPostContent.maxLines = 1
                    txtPostMore.text = "더보기"
                    isTxtMore = false
                } else {
                    txtPostContent.maxLines = 10
                    txtPostMore.text = "접기"
                    isTxtMore = true
                }
            }

            linearLayoutPost.addView(itemView)
        }
    }
}
