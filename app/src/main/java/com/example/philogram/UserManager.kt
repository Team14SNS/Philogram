package com.example.philogram

data class User(
    val id: String,
    var pw: String,
    val name: String,
    var nickname: String,
    var nation:String? = null,
    var intro:String? = null
)

object UserManager {
    private val users = mutableListOf<User>()
    var currentUser: User? = null   // 로그인된 사용자 정보저장

    fun addUser(user: User) {
        users.add(user)
    }

    fun loginUser(id: String, pw: String): Boolean {
        val user = users.find { it.id == id && it.pw == pw }
        if (user != null) {
            currentUser = user
            return true
        }
        return false
    }

    fun findUserById(id: String): User? {
        return users.find { it.id == id }
    }

    fun isUserExist(id: String): Boolean {
        return findUserById(id) != null
    }

    fun resetPw(userId: String, newPw: String): Boolean {
        val user = users.find { it.id == userId }
        if (user != null) {
            user.pw = newPw // 해당 User 객체의 pw만 변경
            return true
        }
        return false
    }
}
