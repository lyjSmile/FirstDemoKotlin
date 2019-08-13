package com.example.lingyajun.firstapplication

import com.example.lingyajun.firstapplication.arithmetic.NarcissisticNumber
import com.example.lingyajun.firstapplication.jsondemo.Man
import com.google.gson.Gson
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

object MainTest {
    val print = { name: String ->
        println(name)

    }

    @JvmStatic
    fun main(args: Array<String>) {
//        print("凌亚军")
//        getView(ViewType.TypeBlue).showView()
//       Foreach.testForEach()
//        ExpendMethod.test()
//        println(HeroGalen() vs HeroJs())
//        val manJson = Gson().toJson(Man())
//        println(manJson)
//        println(Gson().fromJson(manJson,Man::class.java).name.toString())
//        NarcissisticNumber.run()
        val job = launch {
            repeat(100){
                println("job 启动$it")
                delay(500)
            }
        }

        val job1 = launch {
            println("job1启动")
            repeat(100){
                println("job1启动$it")
                delay(500)
            }
        }
        Thread.sleep(40000)
        job.cancel()
    }
}
