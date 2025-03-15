package com.calisma.step4

fun main()
{
    val nesne1 = OverrideSuperClass()
    println("hayattaki oyuncular = ")
    for (oyuncu in nesne1.hayattakiOyuncular)
        println(oyuncu)

    println("----------------\n")
    nesne1.oyuncuOldur()
    nesne1.oyuncuOldur()
    nesne1.oyuncuOldur()

    println("hayattaki oyuncular = ")
    for(oyuncu in nesne1.hayattakiOyuncular)
        println(oyuncu)

    val nesne2 = OverrideSubClass2()
    println("----------------\n")
    println("hayattaki oyuncular = ")
    for (oyuncu in nesne2.hayattakiOyuncular)
        println(oyuncu)

    nesne2.oyuncuOldur()

}