package com.example.philogram

data class User(val id: String, val pw: String, val name: String, val nickname: String)

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
}
