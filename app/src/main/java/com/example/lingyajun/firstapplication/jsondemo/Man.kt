package com.example.lingyajun.firstapplication.jsondemo

/**
 *Created by lingyajun on 2019-07-23
 *Describe:
 **/
class Man(sex: String = "男") : People<ChineseName>() {
    init {
        this.sex = sex
        this.name = ChineseName("凌亚军")
    }
}