package com.calisma.step2

var hizmet = "gelirBeyani" //burada da top-level tanimlamalar yaptik. herhangi bir sinifa bagli degiller statik ozellik gosteriyorlar ve global degisken ya da fonksiyonlar.
//val degisken var ile degistirildi
fun hizmetYazdir()
{
    println("verilen hizmet = $hizmet")
}

fun hizmetDegistir(yeniHizmet:String)
{
    hizmet = yeniHizmet  //this kullanım hatasi duzeltildi. This siniflar icerisinde bir nesneye referans olarak kullanılır. burada hizmet degiskeni ve hizmetDegistir fonksiyonu bir sinifa bagli degil ve top-level degiskenlerler.
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

    hizmetDegistir("giderToplami")

    hizmetYazdir()
}
