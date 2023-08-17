package com.example.philogram

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.philogram.TestValues.addView
import com.example.philogram.TestValues.findNameByIndex
import com.example.philogram.TestValues.findUserFeed
import com.example.philogram.TestValues.findUserInfo
import com.example.philogram.TestValues.getViewByIndex
import com.example.philogram.TestValues.mapUser
import com.example.philogram.main.MainPostItem


class DetailActivity : AppCompatActivity() {
    private var screenWidth: Int = 0
    private var screenHeight: Int = 0
    private var idx: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val txtPost = findViewById<TextView>(R.id.txt_post)
        val txtView = findViewById<TextView>(R.id.txt_view)
        val txtEdit = findViewById<TextView>(R.id.txt_edit)
        val btnBack = findViewById<ImageButton>(R.id.btn_back)

        val intent = intent
        idx = intent.getStringExtra("idx")!!.toInt()

        if(idx == 5) {
            mapUser[idx] = UserInfo(UserManager.currentUser!!.name, 0, ArrayList())
            txtEdit.text = "편집"

            txtEdit.setOnClickListener {
                startActivity(Intent(this@DetailActivity, MyPageEditActivity::class.java))
            }
        }

        btnBack.setOnClickListener {
            finish()
        }

        // 기기의 가로 세로 길이 설정...
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        screenWidth = displayMetrics.widthPixels
        screenHeight = displayMetrics.heightPixels

        // user 찾기
        val user = findUserInfo(idx)

        val name = user.name
        val userFeed = user.feed

        // 프로필 초기화...
        initProfile(name, userFeed)

        Log.d("진입", userFeed.size.toString())
        txtPost.text = userFeed.size.toString()
        addView(idx)
        txtView.text = getViewByIndex(idx).toString()
    }

    // 가로 세로 전환 시 실행...
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels
        screenHeight = displayMetrics.heightPixels

        // 화면 방향이 변경되었으므로 initProfile 함수를 호출하여 그리드 레이아웃 업데이트
        idx = intent.getStringExtra("idx")!!.toInt()
        var name = findNameByIndex(idx)
        val userFeed = findUserFeed(idx)
        initProfile(name, userFeed)
    }

    private fun initProfile(name: String, list: List<MainPostItem>) {
        val photoGridLayout: GridLayout = findViewById(R.id.photoGridLayout)
        val imgProfile = findViewById<ImageView>(R.id.img_profile)
        val textUserName = findViewById<TextView>(R.id.text_username)

        photoGridLayout.removeAllViews()

        textUserName.text = name
        if(idx == 5) {
            imgProfile.setImageResource(R.drawable.ic_logo)
        } else {
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
                    intent.putExtra("idx", idx)
                    startActivity(intent)
                }

                photoGridLayout.addView(itemView)
            }
        }
    }
}