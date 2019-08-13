package com.example.lingyajun.firstapplication

class Foreach {

    companion object {

        fun testForEach() {
            //1
            for (i in 1..10) {
                println("..<>$i")
            }

            //2
            for (i in 1 until 10) {
                println("until<>$i")
            }
            //3
            for (i in 10 downTo 1) {
                println("downTo<>$i")
            }
            //4
            for (i in 1..10 step 3) {
                println("step<>$i")
            }
            //5
            repeat(10) {
                println("repeat<>$it")
            }
            //6
            val map = hashMapOf<String, String>("key" to "value", "key1" to "value1")
            for ((k, v) in map) {
                println("map key = $k<> value= $v")
            }

        }

    }
}