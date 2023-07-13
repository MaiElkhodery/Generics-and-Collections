package com.example.stack_linkedlist

fun main(){

    //Stack
    val stack = Stack<Char>()
    stack.push('k')
    stack.push('e')
    stack.push('o')
    stack.push('r')

    stack.printStack()

    stack.pop()
    stack.pop()

    println(stack.size())
    stack.printStack()

    //LinkedList.kt
    val linkedList = LinkedList<Double>()

    println(linkedList.isEmpty())
    linkedList.add(10.2)
    linkedList.add(102.2)
    linkedList.add(155.8)
    linkedList.add(12.9)

    println(linkedList.getSize())
    println(linkedList.isEmpty())

    println(linkedList.remove(10.2))
    println(linkedList.remove(155.2))
    println(linkedList.remove(155.8))

    println(linkedList.getSize())

}








