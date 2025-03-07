package com.calisma.step1

fun main()
{
    val birsey = VarargParametre()

    println("ilk sonuc = ${birsey.toplam}")
    birsey.sonucDegistir(4,5,6,7,8,9)
    println("ikinci sonuc = ${birsey.toplam}")
    birsey.sonucDegistir(1)
    println("ucuncu sonuc = ${birsey.toplam}")

    val dizi = intArrayOf(1,2,5,2)
    birsey.sonucDegistir(*dizi)  //bu sekilde vararg parametreye dizi gonderecegimiz zaman dizi isminin basina (*) koymamiz gerkiyor. boylece dizi vararg a donusmus oluyor.
    println("dorduncu sonuc = ${birsey.toplam}")
}