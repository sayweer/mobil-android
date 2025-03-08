package com.calisma.step2

fun String.unlemEkleVeYazdir():String //Bu sekilde sadece kendi olusturdugumuz siniflarda degil standart kutuphaneyle gelen siniflara da yapiyi degistirmeden fonksiyon ekleme yapabiliyoruz.
{
    return this + "!"
}

fun ExstensionSinif.boyutDegistir(boyut:Int)
{
    this.boyut = boyut
}
fun main()
{
    var mesaj = "gunagardi"
    println(mesaj)
    println(mesaj.unlemEkleVeYazdir())

    val obj1 = ExstensionSinif()

    println(obj1.boyut)
    obj1.boyutDegistir(302)
    println("yeni boyut = ${obj1.boyut}")
}