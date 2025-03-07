package com.calisma.step1

fun main()
{
    val nesne1 = FonksiyonParametreleri()

    println(nesne1.deger)
    nesne1.degerArtis()
    println(nesne1.deger)
    nesne1.degerEksiltme()
    println(nesne1.deger)
    nesne1.degerDegistir(999)
    println(nesne1.deger)
    println("---------------------")

    val nesne2 = FonksiyonParametreleri()
    println(nesne2.deger)
    println(nesne2.yil)
    println(nesne2.marka)
    println(nesne2.ortakSayisi)

    nesne2.tumDegerleriDegistir("mars" ,1950 ,12 ,898)
    println(nesne2.deger)
    println(nesne2.yil)
    println(nesne2.marka)
    println(nesne2.ortakSayisi)

    println("------------------")
    println(nesne2.marka)
    nesne2.degerDegistir("ucurum")
    println(nesne2.marka)

}