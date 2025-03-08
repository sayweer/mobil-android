package com.calisma.step2

fun main()
{
    val primaryNesne1 = Constructorlar(999) //burada primary constructorun iki parametresi olmasina ragmen tek parametre girerek nesneyi olusturabildik cunku isim parametresini defauld bir sekilde olusturmustuk burada ekstradan bir deger vermedigimiz icin defauld deger gecerli oldu.
    val primaryNesne2 = Constructorlar(888,"oguz")
    println(primaryNesne1.isim)//burada seyit ciktisini alacagiz

    val secondaryNesne1 = Constructorlar(777,3200)

    println(secondaryNesne1.isim)
    println(secondaryNesne1.nufus)

}