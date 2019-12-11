package com.example.lingyajun.firstapplication.arithmetic

import java.util.*


/**
 *Created by lingyajun on 2019-12-07
 *Describe: 树的相关算法
 **/
class TreeClass {

    class TreeNode(val value: Int) {
        var left: TreeNode? = null

        var right: TreeNode? = null
    }

    companion object{
        fun testMaxDepth(){
            val tree0 = TreeNode(0)
            val tree1 = TreeNode(1)
            val tree2 = TreeNode(2)
            val tree3 = TreeNode(3)
            val tree4 = TreeNode(4)
            val tree5 = TreeNode(5)
            tree0.left = tree1
            tree1.left = tree2
            tree2.left = tree3
            tree3.left = tree4
            tree0.right = tree5
            print(TreeClass().findMaxDepth(tree0))
        }
    }
    fun testTree() {
        val tree0 = TreeNode(0)
        val tree1 = TreeNode(1)
        val tree2 = TreeNode(2)
        val tree3 = TreeNode(3)
        val tree4 = TreeNode(4)
        val tree5 = TreeNode(5)
        tree0.left = tree1
        tree0.right = tree2
        tree1.left = tree3
        tree1.right = tree4
        tree2.left = tree5
        systemTree(tree0)
        val root = invertTreeQueue(tree0)
        println("")
        systemTree(root)
    }

    /**
     * 递归反转二叉树
     */
    private fun invertTreeNode(root: TreeNode?): TreeNode? {
        if (root == null) {
            return root
        }
        val left = root.left
        val right = root.right
        root.right = invertTreeNode(left)
        root.left = invertTreeNode(right)
        return root
    }

    private fun invertTreeQueue(root: TreeNode?): TreeNode? {
        val queue: Queue<TreeNode> = LinkedList<TreeNode>()
        queue.add(root)
        while (!queue.isEmpty()) {
            val temp = queue.poll()
            val left = temp.left
            val right = temp.right
            temp.left = right
            temp.right = left
            if (left != null) {
                queue.offer(left)
            }
            if (right != null) {
                queue.offer(right)
            }
        }
        return root
    }

    fun systemTree(root: TreeNode?) {
        root?.also {
            print(root.value)
        }

        var left = root?.left
        var right = root?.right
        if (left != null || right != null) {
            systemTree(left)
            systemTree(right)
        }
    }

    /**
     * 查找树的最大深度
     * 1.用栈遍历实现 2019-12-11 10:50
     * 2.用递归实现
     */
    fun findMaxDepth(treeNode: TreeNode): Int {
        val queue = LinkedList<Pair<Int,TreeNode>>()
        queue.add(Pair(1,treeNode))
        var maxDepth = 0
        while (!queue.isEmpty()) {
            val pair = queue.poll()
            val rooTree = pair.second
            var currentDepth = pair.first
            maxDepth = currentDepth.coerceAtLeast(maxDepth)
            val left = rooTree.left
            val right = rooTree.right
            if (left != null) {
                queue.add(Pair(++currentDepth,left))
            }
            if (right != null){
                queue.add(Pair(++currentDepth,right))
            }
        }

        return maxDepth
    }
}