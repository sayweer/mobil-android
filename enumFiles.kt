package com.calisma.step3

fun main()
{
    val ilkGirilenler = EnumarationClasss.TURK
    println(ilkGirilenler.name)
    println(ilkGirilenler.ordinal)//enum siniflarda name ve ordinal ozellikleri otomatik olarak olusturuluyor ve name sabitin ismini string olarak tutuyor ordinal ise sabitin index numarasını int olarak.

    val ikinciGirilenler = EnumarationClasss.ISPANYOL
    println(ikinciGirilenler.isimSayisi)
    println("----------")
    ikinciGirilenler.isimEkle(1500)
    println(ikinciGirilenler.isimSayisi)
    println(ikinciGirilenler.enPopuler)

    val nesne1 = EnumarationClass2()

    println(nesne1.descriptionEnumaration(ikinciGirilenler))
}