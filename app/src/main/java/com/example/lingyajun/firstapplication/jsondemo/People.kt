package com.example.lingyajun.firstapplication.jsondemo

/**
 *Created by lingyajun on 2019-07-23
 *Describe:
 **/
open class People<T : Name> {

    open var name: T? = null
    var sex :String ? = null
}