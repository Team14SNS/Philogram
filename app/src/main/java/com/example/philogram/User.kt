package com.example.philogram

data class User(val id: String, val pw: String, val name: String, val nickname: String)

object UserManager {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun loginUser(id: String, pw: String): Boolean {
        val user = users.find { it.id == id }
        return user?.pw == pw
    }

    fun findUserById(id: String): User? {
        return users.find { it.id == id }
    }

    fun isUserExist(id: String): Boolean {
        return findUserById(id) != null
    }
}
