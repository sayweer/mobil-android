package com.calisma.step2

val hizmet = "gelirBeyani" //burada da top-level tanimlamalar yaptik. herhangi bir sinifa bagli degiller statik ozellik gosteriyorlar ve global degisken ya da fonksiyonlar.

fun hizmetYazdir()
{
    println("verilen hizmet = $hizmet")
}
fun main()
{
    println(StatikDegiskenVeMethodlar.isim)
    println(StatikDegiskenVeMethodlar.yas) // bu sekilde sinif ismini kullanarak statik degiskenlere erisebiliyoruz.
    StatikDegiskenVeMethodlar.buyume()

    println(StatikDegiskenVeMethodlar.isim)
    println(StatikDegiskenVeMethodlar.yas)

    StatikDegiskenVeMethodlar.yazdir()

    hizmetYazdir() //burada da top-level fonksiyonu kullandik.
}