package com.calisma.step4

fun main()
{
    val nesne1 = superClassOrnek1("sel",163)
    val nesne2 = subClassOrnek1()

    nesne1.yazdir()
    nesne1.boyutDegistir(171)
    nesne1.yazdir()
    println("-----------------")

    println(nesne2.renk)
    println(nesne2.boyut)
    nesne2.yazdir()
    nesne2.boyutDegistir(167)
    println(nesne2.boyut)
}