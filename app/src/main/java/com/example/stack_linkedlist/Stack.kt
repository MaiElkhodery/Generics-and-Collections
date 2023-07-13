package com.example.stack_linkedlist

class Stack<T> {
    private val list = mutableListOf<T>()

    fun push(item : T){
        list.add(item)
    }
    fun pop():T?{
        return list.removeLastOrNull()
    }
    fun size():Int{
        return list.size
    }
    fun isEmpty():Boolean{
        return list.isEmpty()
    }
    fun printStack(){
        if(isEmpty()){
            println("Empty")
        }else{
            for(item in list){
                print("$item  ")
            }
            println()
        }
    }
}