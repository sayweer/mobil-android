package com.calisma.step3

fun main()
{
    val perde1 = CompositionPerde.DESENLI
    val perde2 = CompositionPerde.DESENSIZ

    val catal1 = CompositionCatal(4 ,90)

    var ev1 = CompozitionEv("Seyit", "Sel" ,perde1 ,catal1)
    var ev2 = CompozitionEv("d" ,"d" ,perde2 ,catal1)

    println(ev1.catal.adet)
    ev1.catal.catalAl(15)
    println(ev1.catal.adet)

    println("ev1 in sahibi = ${ev1.evSahibi} asil sahibi = ${ev1.evKagitUzeirindeOlmayanGercekSahibi}")
    ev1.sahiplikSiralamasiniDegistir()
    println("su an ev1 sahibi = ${ev1.evSahibi} ,soz sahibi = ${ev1.evKagitUzeirindeOlmayanGercekSahibi}")
}