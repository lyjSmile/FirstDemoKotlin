package com.example.lingyajun.firstapplication

/**
 *Created by lingyajun on 2019-07-21
 *Describe: 中缀表达式
 **/


sealed class CompareResult {
    object EQUAL : CompareResult() {
        override fun toString(): String {
            return "一致"
        }
    }

    object LESS : CompareResult() {
        override fun toString(): String {
            return "低于"
        }
    }

    object MORE : CompareResult() {
        override fun toString(): String {
            return "高于"
        }
    }
}

open class Hero(var name: String, var level: Int)
class HeroGalen : Hero("盖伦", 18)
class HeroJs : Hero("剑圣", 17)

infix fun Hero.vs(hero: Hero): String =
        when {
            this.level > hero.level -> this.name + "等级" + CompareResult.MORE.toString() + hero.name + "," + this.name + "牛逼"
            this.level > hero.level -> this.name + "等级" + CompareResult.LESS.toString() + hero.name + "," + hero.name + "牛逼"
            else -> this.name + "等级" + CompareResult.EQUAL.toString() + hero.name + ",都牛逼"
        }

