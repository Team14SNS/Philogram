package com.example.philogram

import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.philogram.TestValues.addView
import com.example.philogram.TestValues.findNameByIndex
import com.example.philogram.TestValues.findUserFeed
import com.example.philogram.TestValues.findUserInfo
import com.example.philogram.TestValues.getViewByIndex
import com.example.philogram.TestValues.mapUser
import com.example.philogram.UserManager.currentUser
import com.example.philogram.main.MainPostItem


@RequiresApi(Build.VERSION_CODES.O)
class DetailActivity : AppCompatActivity() {
    private var screenWidth: Int = 0
    private var screenHeight: Int = 0
    private var idx: Int = 0
    private lateinit var txtPost: TextView
    private lateinit var txtView: TextView
    private lateinit var txtEdit: TextView
    private lateinit var txtLogout: TextView
    private lateinit var txtNation: TextView
    private lateinit var txtIntro: TextView
    private lateinit var btnBack: ImageButton
    private lateinit var photoGridLayout: GridLayout
    private lateinit var imgProfile: ImageView
    private lateinit var textUserName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // id 찾기...
        txtPost = findViewById(R.id.txt_post)
        txtView = findViewById(R.id.txt_view)
        txtEdit = findViewById(R.id.txt_edit)
        txtLogout = findViewById(R.id.txt_logout)
        txtNation = findViewById(R.id.text_nationality)
        txtIntro = findViewById(R.id.txt_introduction)
        btnBack = findViewById(R.id.btn_back)
        photoGridLayout = findViewById(R.id.photoGridLayout)
        imgProfile = findViewById(R.id.img_profile)
        textUserName = findViewById(R.id.text_username)


        val intent = intent
        idx = intent.getStringExtra("idx")!!.toInt()

        if (idx == 5) {
<<<<<<< HEAD
            mapUser[idx] = UserInfo(UserManager.currentUser!!.name, 0, ArrayList(), "한국", "")
            txtEdit.text = getString(R.string.edit)
=======
            mapUser[idx] = UserInfo(
                currentUser!!.name,
                0,
                ArrayList(),
                currentUser!!.nation.toString(),
                currentUser!!.intro.toString()
            )
            txtEdit.text = "편집"
            txtLogout.text = "로그 아웃"
>>>>>>> 0a9872140daf154bca5fe151742ab54059a1bf83

            txtEdit.setOnClickListener {
                startActivity(Intent(this@DetailActivity, MyPageEditActivity::class.java))
            }
            txtLogout.setOnClickListener{
                showLogoutDialog()
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
        idx = intent.getStringExtra("idx")!!.toInt()
        var name = findNameByIndex(idx)
        val userFeed = findUserFeed(idx)
        initProfile(name, userFeed)
    }

    override fun onResume() {
        super.onResume()
        if (idx == 5) {
            mapUser[idx] = UserInfo(
                currentUser!!.name, mapUser[idx]!!.view++, ArrayList(),
                currentUser!!.nation.toString(), currentUser!!.intro.toString()
            )

            val user = mapUser[idx]

            initProfile(user!!.name, user.feed)
        }
    }

    private fun initProfile(name: String, list: List<MainPostItem>) {
        photoGridLayout.removeAllViews()

        textUserName.text = name
        if (idx == 5) {
            imgProfile.setImageResource(R.drawable.ic_logo)
            txtPost.text = list.size.toString()
            txtView.text = getViewByIndex(idx).toString()
            txtNation.text = currentUser!!.nation
            txtIntro.text = currentUser!!.intro
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

    private fun showLogoutDialog() {
        val builder = AlertDialog.Builder(this)
        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.dialog_logout, null)

        builder.setView(dialogView)
        val dialog = builder.create()

        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));

        val btnLogout = dialogView.findViewById<TextView>(R.id.btn_login)
        val btnCancel = dialogView.findViewById<ImageButton>(R.id.btn_cancle)

        btnLogout.setOnClickListener {
            currentUser = null
            dialog.dismiss()
            finish()
        }

        btnCancel.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}