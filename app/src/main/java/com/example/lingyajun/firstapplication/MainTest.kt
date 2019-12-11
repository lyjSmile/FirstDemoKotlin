package com.example.lingyajun.firstapplication

import com.example.lingyajun.firstapplication.arithmetic.NodeTest
import com.example.lingyajun.firstapplication.arithmetic.TreeClass

object MainTest {
    val print = { name: String ->
        println(name)

    }

    @JvmStatic
    fun main(args: Array<String>) {
        val node = NodeTest.ListNode(1)
        val node2 =  NodeTest.ListNode(2)
        val node3 =  NodeTest.ListNode(3)
        val node4 =  NodeTest.ListNode(4)
        val node5 =  NodeTest.ListNode(5)
        val node6 =  NodeTest.ListNode(6)
        node.next = node2
        node2.next = node3
        node3.next = node4
        node4.next = node5
        node5.next = node6
        node6.next = node

//       val isLoop =  NodeTest().judgeNodeLoop(node)
//        println(isLoop)
//        TreeClass().testTree()
        TreeClass.testMaxDepth()
    }
}
