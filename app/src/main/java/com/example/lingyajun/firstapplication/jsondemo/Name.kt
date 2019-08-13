package com.example.lingyajun.firstapplication.jsondemo

/**
 *Created by lingyajun on 2019-07-23
 *Describe:
 **/
open class Name {
}

class ChineseName(var name: String) : Name(){
    override fun toString(): String {
        return "ChineseName(name='$name')"
    }
}
class EnglishName(var name: String) : Name(){
    override fun toString(): String {
        return "EnglishName(name='$name')"
    }
}