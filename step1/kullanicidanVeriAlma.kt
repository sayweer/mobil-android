package com.calisma.step6

import java.util.Scanner

fun main()
{
   /* val istemci = Scanner(System.`in`)    //bu sekilde javada ki scanner sınıfından nesne olusturarak da kullanicidan input alabiliriz.
    println("lutfen isminizi giriniz = ")
    val isim = istemci.next()      //next() yazarsa String ister ama sadece ilk bosluga kadar olan kismi alir tum yazdigin metni dondurmesini istiyorsan nextLine() kullanman gerekiyor.
                                //bir int float ya da baska bir turden input almak istiyorsak nextInt()   nextFloat() gibi fonksiyonları da var.
    println("isminiz = $isim")  */

    println("lutfen isminizi giriniz = ")
    val isim2 = readLine() // Bu readLine() ise kotline ozel bir fonksiyon ve kullanicidan veri almamizi sagliyor ve ne yazarsan yaz string olarak donduruyor.
    println(isim2)
    println("lutfen yasinizi giriniz = ")
    val sayi = readLine()?.toIntOrNull()         //eger girilen veriyi bir ture cevirmek istersek toIntOr... yapısı kullanmalı ve sonra da null olup olmadıgını anlayacagımız bir kontrol yapısı kullanmalıyız.

    if (sayi != null)      //gibi gibi bir kontrol artık duruma gore
        println(sayi)
    else
        println("sayi degiskeni null olmus...")
}