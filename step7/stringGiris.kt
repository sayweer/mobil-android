package com.calisma.step7

fun main()
{
    val str1 = "Merhaba"
    val str2 = " Dunya"
    println(str1 + str2)  // bu sekilde birlestirebliriz
    val str3 = str1 + str2  // bu sekilde birlestirip de atayabiliriz.
    println(str3)

    println(str3.length) // bu sekilde de string ifadenin uzunlugunu bulabiliriz.
   // println(str3.size)  //bu sekilde size ile ogrenemeyiz cunku size collection turlerinde ve dizilerde kullanilir.

    if (str1 == str2)  //kotlinde bu sekilde stringlerin esitligini kontrol edebiliriz
        println("esitler.")
    else
        println("esit degiller.")

    for (harf in str1) //bu sekilde String diziymis gibi harf harf alip isleyebiliriz.
        println(harf)

    //String fonksiyonlari en cok kullanilanlar...

    val str4 = "seyit"
    println(str4.subSequence(0,4)) //bu fonksiyon girilen ilk int parametre dahil olmak üzere (indeks olarak) girilen ikinci parametreye kadar olan kismi(dahil değil) kesip donduruyor.

    val str5 = "Merhabalar"
    if(str5.contains("erha"))// bu fonksiyon belirtilen stringde parametrede girilen degerin olup olmadigini kontrol eder. varsa true yoksa false dondurur.
        println("$str5 stirnginde (erha) bulunuyor")
    else
        println("$str5 stringinde (erha) bulunmmuyor")

    val str6 = "Bu stirngde Bazen hepsi BUYUK BAZEN hepsi kucuk"
    val str6buyuk = str6.toUpperCase() //tum harfleri buyuk yapar
    val str6kucuk = str6.toLowerCase() //tum harfleri kucuk yapar
    println(str6kucuk)
    println(str6buyuk)

    val str7 = "merhaba ben seyit gunaydin"
    val str7BoslukDizi = str7.split(" ")// split fonksiyonu parametre olarak girilen seye gore stringi parcalara boler ve parcalari bir dizi olarak dondurur.
    val str7IDizi = str7.split("i")

    for (i in str7BoslukDizi)
        println(i)
    println("-----------------")
    for(i in str7IDizi)
        println(i)

    val str8 = "      Merhaba Dostum       Naber    "
    val str8Bosluksuz = str8.trim() // burada da goruldugu gibi trim() fonksiyonu string ifadenin basindaki ve sonundaki bosluklari silip ortadaki bosluklara karismiyor ve sonucu string olarak donduruyor.
    println(str8Bosluksuz)
}