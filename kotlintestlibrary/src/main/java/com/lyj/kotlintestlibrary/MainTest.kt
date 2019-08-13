package com.lyj.kotlintestlibrary

object MainTest {

    val print = {
        name :String ->
        println(name)
    }
    class Singel private constructor(){
        companion object{
            fun getInstance():Singel = Holder.instance
        }
        private object Holder{
            val instance = Singel()
        }
        fun onlyIf(isDebug:Boolean,block:()->Unit,unBlock:()->Unit){
            if(isDebug) block() else unBlock()
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val emptyList = emptyList<String>()
        MainTest.Singel.getInstance().onlyIf(emptyList.isEmpty(),{
            print("list is null")
        },{
            print("list is not null")
        })
    }


}
