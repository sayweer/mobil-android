package com.calisma.step5

fun main()
{
    val nesne1 = InterfacelerClass()
    val nesne2 = InterfacelerClassSub()

    nesne1.yazdir1()
    println(nesne1.yazdir2())
    println("----------------")
    println(nesne2.yazdir2())
    nesne2.yazdir1()
}