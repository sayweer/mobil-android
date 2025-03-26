package com.calisma.step6

fun main()
{
    val ogrenci1 = OgrenciHashSet(111 ,"seyit" ,999)
    val ogrenci2 = OgrenciHashSet(112 ,"sel" ,998)
    val ogrenci3 = OgrenciHashSet(113 ,"afra" ,997)

    val ogrenciler = hashMapOf<Int , OgrenciHashSet>()
    ogrenciler.put(1 ,ogrenci1)
    ogrenciler.put(2, ogrenci2)
    ogrenciler.put(3 ,ogrenci3)

    println(ogrenciler)
    println("**************************")

    for ((key ,ogrenci) in ogrenciler)
    {
        println("+++")
        println("$key anahtarli ogrencinin \nnosu = ${ogrenci.no}\nismi = ${ogrenci.isim}\npuani = ${ogrenci.puan}")
    }
}