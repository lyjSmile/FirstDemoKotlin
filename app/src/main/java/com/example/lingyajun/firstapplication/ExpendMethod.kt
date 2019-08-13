package com.example.lingyajun.firstapplication

/**
 * 扩展函数
 */
class ExpendMethod {


    companion object {
        fun test() {
            var user: User? = User("lyj")
            user.also {
                it?.age = 23
            }.apply {
                this?.name = null
            }
            println(user)
            user.takeIf { it?.name != null }?.also { println("name =${it.name}") } ?: println("name = null")
        }
    }


    data class User(var name: String?, var age: Int = 0)

}