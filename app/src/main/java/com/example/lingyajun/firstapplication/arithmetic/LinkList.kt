package com.example.lingyajun.firstapplication.arithmetic


/**
 *Created by lingyajun on 2019-08-04
 *Describe:
 **/
class LinkList<E> {


    var first: Node<E>? = null

    var last: Node<E>? = null
    var mSize: Int = 0

    fun add(value: E): Boolean {
        linkLast(value)
        return true
    }

    fun remove(value: E): Boolean {

        return true
    }

    private fun unLinkNode(value: Node<E>?) {
        first ?: return
        value ?: return
        if (value == first) {
            first = first!!.nextNode
        }
        var f = first
        while (f != null && f.nextNode != value) {
            f = f.nextNode
        }
        f ?: return
        f.nextNode = f.nextNode?.nextNode

    }

    private fun linkLast(value: E) {
        val l = last
        val newNode = createNode(value)
        if (l == null) {
            first = newNode
        } else {
            l.nextNode = newNode
        }
        mSize++
    }


    fun createNode(value: E): Node<E> {
        return Node(value, null)
    }

    data class Node<T>(var item: T, var nextNode: Node<T>?)


}