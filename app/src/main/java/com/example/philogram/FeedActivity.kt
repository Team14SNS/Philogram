package com.example.philogram

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.philogram.TestValues.findUserInfo
import com.example.philogram.TestValues.getPostingDate
import com.example.philogram.TestValues.sortByDate

class FeedActivity : AppCompatActivity() {
    private val linearLayoutPost by lazy {
        findViewById<LinearLayout>(R.id.linearLayout_post)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        val btnBack = findViewById<ImageButton>(R.id.btn_back)

        val intent = intent
        val idx = intent.getIntExtra("idx", -1)

        val user = findUserInfo(idx)

        addPostItem(user)

        btnBack.setOnClickListener {
            finish()
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun addPostItem(user: UserInfo) {
        for (feed in user.feed) {
            val itemView = layoutInflater.inflate(R.layout.item_main_post, null)
            val imtPostProfile = itemView.findViewById<ImageView>(R.id.img_post_profile)
            val txtPostUserName = itemView.findViewById<TextView>(R.id.txt_post_userName)
            val imgPostHeart = itemView.findViewById<ImageView>(R.id.img_post_heart)
            val imgPostPicture = itemView.findViewById<ImageView>(R.id.img_post_picture)
            val txtPostContent = itemView.findViewById<TextView>(R.id.txt_post_content)
            val txtPostMore = itemView.findViewById<TextView>(R.id.txt_post_more)
            val txtPostDate = itemView.findViewById<TextView>(R.id.txt_post_date)

            imtPostProfile.setImageResource(feed.imgPostProfile)
            txtPostUserName.text = feed.txtPostUserName
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

            // 게시글 이미지 설정...
            imgPostPicture.setImageResource(feed.imgPostPicture)

            // 게시글 본문 설정...
            txtPostContent.text = feed.txtPostContent

            // 포스팅 날짜 설정...
            txtPostDate.text = getPostingDate(feed)
            var isTxtMore = false
            txtPostMore.setOnClickListener {
                if (isTxtMore) {
                    txtPostContent.maxLines = 1
                    txtPostMore.text = getString(R.string.item_main_post_more_expand_txt)
                    isTxtMore = false
                } else {
                    txtPostContent.maxLines = 20
                    txtPostMore.text = getString(R.string.item_main_post_more_collapse_txt)
                    isTxtMore = true
                }
            }
            linearLayoutPost.addView(itemView)
        }
    }
}