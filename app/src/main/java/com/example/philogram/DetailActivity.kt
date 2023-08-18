package com.example.philogram

import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.philogram.TestValues.addView
import com.example.philogram.TestValues.findNameByIndex
import com.example.philogram.TestValues.findUserFeed
import com.example.philogram.TestValues.findUserInfo
import com.example.philogram.TestValues.getViewByIndex
import com.example.philogram.TestValues.mapUser
import com.example.philogram.TestValues.sortByDate
import com.example.philogram.main.MainPostItem


@RequiresApi(Build.VERSION_CODES.O)
class DetailActivity : AppCompatActivity() {
    private var screenWidth: Int = 0
    private var screenHeight: Int = 0
    private var idx: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnBack = findViewById<ImageButton>(R.id.btn_back)
        val btnLogout = findViewById<ImageButton>(R.id.btn_logout)
        val btnEdit = findViewById<ImageButton>(R.id.btn_edit)
        val txtPost = findViewById<TextView>(R.id.txt_post)
        val txtView = findViewById<TextView>(R.id.txt_view)
        val txtNation = findViewById<TextView>(R.id.text_nationality)
        val txtIntro = findViewById<TextView>(R.id.txt_introduction)

        val intent = intent
        idx = intent.getIntExtra("idx", -1)

        if (idx == 5) {
            mapUser[idx] = UserInfo(UserManager.currentUser!!.name, 0, ArrayList(), "한국", "")
            btnLogout.visibility = View.VISIBLE
            btnEdit.visibility = View.VISIBLE

            btnLogout.setOnClickListener {
                //
            }

            btnEdit.setOnClickListener {
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

        // 리스트 값 가져오기...
        val userFeed = user.feed

        // 프로필 초기화...
        initProfile(name, userFeed)

        // 인물 정보 설정...
        txtPost.text = userFeed.size.toString()
        addView(idx)
        txtView.text = getViewByIndex(idx).toString()
        txtNation.text = user.nation
        txtIntro.text = user.intro
    }

    // 가로 세로 전환 시 실행...
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        screenWidth = displayMetrics.widthPixels
        screenHeight = displayMetrics.heightPixels

        // 화면 방향이 변경되었으므로 initProfile 함수를 호출하여 그리드 레이아웃 업데이트
        idx = intent.getIntExtra("idx", -1)
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