package com.example.lingyajun.firstapplication.jsondemo

/**
 *Created by lingyajun on 2019-07-23
 *Describe:
 **/
class Women(sex: String = "女") : People<EnglishName>() {

    init {
        this.sex = sex
        this.name = EnglishName("lyj")
    }
}