package com.example.philogram

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.philogram.main.MainPostItem


class DetailActivity : AppCompatActivity() {
    private var screenWidth: Int = 0
    private var screenHeight: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val idx = intent.getStringExtra("idx")
        var name = findNameByIndex(idx!!)

        // 기기의 가로 세로 길이 설정...
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        screenWidth = displayMetrics.widthPixels
        screenHeight = displayMetrics.heightPixels

        // user 찾기
        val userFeed = findUserFeed(name, TestValues.postItems)
        initProfile(name, userFeed)

        val txtEdit = findViewById<TextView>(R.id.txt_edit)

        txtEdit.setOnClickListener {
            startActivity(Intent(this@DetailActivity, MyPageEditActivity::class.java))
        }
    }

    private fun findUserFeed(name: String, list: List<MainPostItem>): List<MainPostItem> {
        return list.filter { it.txtPostUserName == name }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels
        screenHeight = displayMetrics.heightPixels

        // 화면 방향이 변경되었으므로 initProfile 함수를 호출하여 그리드 레이아웃 업데이트
        val idx = intent.getStringExtra("idx")
        var name = findNameByIndex(idx!!)
        val userFeed = findUserFeed(name, TestValues.postItems)
        initProfile(name, userFeed)
    }

    private fun initProfile(name: String, list: List<MainPostItem>) {
        val photoGridLayout: GridLayout = findViewById(R.id.photoGridLayout)
        val imgProfile = findViewById<ImageView>(R.id.img_profile)
        val textUserName = findViewById<TextView>(R.id.text_username)

        photoGridLayout.removeAllViews()

        textUserName.text = name
        imgProfile.setImageResource(list[0].imgPostProfile)

        for (item in list) {
            val itemView = layoutInflater.inflate(R.layout.square_img, null)
            val imgFeed = itemView.findViewById<ImageView>(R.id.img_feed)
            imgFeed.setImageResource(item.imgPostPicture)

            val layoutParams = GridLayout.LayoutParams().apply {
                width = screenWidth / 3
                height = GridLayout.LayoutParams.WRAP_CONTENT
            }
            itemView.layoutParams = layoutParams

            itemView.setOnClickListener {
                val intent = Intent(this@DetailActivity, FeedActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("context", item.txtPostContent)
                intent.putExtra("profile", item.imgPostProfile)
                intent.putExtra("postpicture", item.imgPostPicture)
                startActivity(intent)
            }

            photoGridLayout.addView(itemView)
        }
    }

    // index로 user 찾기
    private fun findNameByIndex(index:String): String{
        when (index) {
            "0" -> {
                return "Buddha"
            }

            "1" -> {
                return "Nietzsche"
            }

            "2" -> {
                return "Plato"
            }

            "3" -> {
                return "Descartes"
            }

            "4" -> {
                return "Confucius"
            }
        }
        return ""
    }
}