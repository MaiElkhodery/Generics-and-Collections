package com.example.stack_linkedlist

class LinkedList<T> {
    var first : Node<T>? = null
    var last : Node<T>? = null
    private var size : Int = 0

    fun add(value : T){
        val newNode = Node(value)
        if (isEmpty()){
            first = newNode
            last=newNode
        }else{
            last?.nextNode = newNode
            last=newNode
        }
        size++
    }
    fun remove(item : T):Boolean{
        var current = first
        var previous : Node<T>? = null

        while(current != null){
            if(current.data==item){
                if(previous==null){
                    first = current.nextNode
                    if(first == null)
                        last=null
                }else{
                    previous.nextNode=current.nextNode
                    if (current.nextNode==null)
                        last=previous
                }
                size--
                return true
            }
            previous=current
            current=current.nextNode
        }
        return false
    }
    fun isEmpty():Boolean{
        return size==0
    }
    fun getSize():Int{
        return size
    }
}

data class Node<T>(val data : T, var nextNode : Node<T>? = null)