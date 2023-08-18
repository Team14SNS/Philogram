package com.example.philogram.main

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
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

        val txtMain = findViewById<TextView>(R.id.txt_main)
        txtMain.text = if(userName != null) "$userName" + getString(R.string.main_welcome) else getString(R.string.main_login_txt)

    }

    private fun initView() {
        imgUser.setOnClickListener {
            if (UserManager.currentUser?.name != null) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("idx", 5)
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
                intent.putExtra("idx", profileItems.indexOf(item))

                startActivity(intent)
                overridePendingTransition(R.drawable.slide_right, R.drawable.slide_left)
            }
        }
    }

    private fun addPostItem() {
        sortByDate()
        for (item in postItems) {
            val itemView = layoutInflater.inflate(R.layout.item_main_post, null)
            val imgPostProfile = itemView.findViewById<ImageView>(R.id.img_post_profile)
            val txtPostUserName = itemView.findViewById<TextView>(R.id.txt_post_userName)
            val imgPostHeart = itemView.findViewById<ImageView>(R.id.img_post_heart)
            val imgPostPicture = itemView.findViewById<ImageView>(R.id.img_post_picture)
            val txtPostContent = itemView.findViewById<TextView>(R.id.txt_post_content)
            val txtPostMore = itemView.findViewById<TextView>(R.id.txt_post_more)
            val txtPostDate = itemView.findViewById<TextView>(R.id.txt_post_date)

            imgPostProfile.setImageResource(item.imgPostProfile)
            imgPostProfile.setOnClickListener { // 게시물 아이콘 클릭 시 디테일페이지 이동
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("idx", clickMainPost(item.txtPostUserName))
                startActivity(intent)
            }

            txtPostUserName.text = item.txtPostUserName
            txtPostUserName.setOnClickListener { // 게시물 작성자명 클릭 시 디테일페이지 이동
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("idx", clickMainPost(item.txtPostUserName))
                startActivity(intent)
            }

            var isHeart = false
            imgPostHeart.setOnClickListener { // 게시물 하트 클릭 리스너
                if (isHeart) {
                    imgPostHeart.setImageResource(R.drawable.ic_empty_heart)
                    isHeart = false
                } else {
                    imgPostHeart.setImageResource(R.drawable.ic_full_heart)
                    isHeart = true
                }
            }

            imgPostPicture.setImageResource(item.imgPostPicture)
            imgPostPicture.setOnClickListener { // 게시물 클릭 시 전체 이미지 출력
                val dialogView = layoutInflater.inflate(R.layout.dialog_image_popup, null)
                val ImgDialog = dialogView.findViewById<ImageView>(R.id.img_dialog)

                Glide.with(this).load(item.imgPostPicture).into(ImgDialog)

                val dialog = AlertDialog.Builder(this@MainActivity)
                    .setView(dialogView)
                    .create()
                dialog.window?.setBackgroundDrawableResource(R.color.dialog_transparent)
                dialog.show()
            }

            txtPostContent.text = item.txtPostContent
            var isTxtMore = false
            txtPostMore.setOnClickListener { // 게시물 1줄 이상일 경우 펼치기 기능
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

            txtPostDate.text = TestValues.getPostingDate(item) // 게시물 업로드 일자

            linearLayoutPost.addView(itemView)
        }
    }

    private fun clickMainPost(selectItem: String): Int {
        if(selectItem.contains("Buddha")) {
            return 0
        } else if(selectItem.contains("Nietzsche")) {
            return 1
        } else if(selectItem.contains("Plato")) {
            return 2
        } else if(selectItem.contains("Descartes")) {
            return 3
        } else if(selectItem.contains("Confucius")) {
            return 4
        }
        return -1
    }
}
