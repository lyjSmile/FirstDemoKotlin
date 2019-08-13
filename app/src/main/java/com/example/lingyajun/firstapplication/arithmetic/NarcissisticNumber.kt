package com.example.lingyajun.firstapplication.arithmetic

import kotlin.math.pow

/**
 *Created by lingyajun on 2019-07-30
 *Describe: 水仙花数 1^3 + 5^3+ 3^3 = 153
 **/
object NarcissisticNumber {

    fun run() {
        for (x in 0..9) {
            for (y in 0..9) {
                for (z in 0..9) {
                    val pow = (x.toDouble().pow(3.toDouble())
                    +y.toDouble().pow(3.toDouble())
                    +z.toDouble().pow(3.toDouble())).toInt()
                    val sum = x * 100 + y * 10 + z
                    if (pow == sum){
                        println("水仙花数：$sum")
                    }
                }
            }
        }
    }
}