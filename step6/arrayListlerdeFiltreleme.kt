package com.calisma.step6

fun main()
{
    val sayilar =listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

    val yeniListe = sayilar.filter { it % 2 == 0}    //filter fonksiyonu bu sekilde lambda icerisinde yazilan sarti saglayan degerleri bir liste olarak donduruyor
    println(yeniListe)    //olusturulan yeni listenin icerisine lambda fonksiyonunda yazdigimiz kosulu saglayan elemanlar atandi.
    println(sayilar)    // sayilar listesi icin birseyin degismedigini goruyoruz.

    val yeniListe2 = sayilar.filterNot { it % 2 == 0 }  //filterNot fonksiyonu ise filter fonksiyonunun tersine lambda fonksiyonu icerisinde yazilan sarti saglamayan degerleri bir liste olarak donduruyor.
    println(yeniListe2)
    println(sayilar) //goruldugu gibi yine orijinal liste degistirilmedi

    val yeniListe3 = sayilar.filterIndexed { index ,_ -> index % 2 == 0 }  //filterIndexed fonksiyonu ise hem sayiya hem de inexine erişif filtreleme yapmamizi sagliyor. Burada kullanilan alttire(_) sayinin kendisiyle ilgilenmiyorum anlamina geliyor.
    println(yeniListe3) //burada gorundugu gibi cift indexli sayilari bu listeye atadik.

    val yeniListe4 = sayilar.filter { it % 2 == 0 && it > 10 }  //burada gorundugu gibi lambda fonksiyonu icerisinde mantıksal operatorler kullanarak birden fazla sartta filtreleme yapilabilir.
    println(yeniListe4)

    val yeniListe5 = sayilar.filter { it < 5 }.toCollection(ArrayList())   //filter ve diger filtreleme fonksiyonlari immutable list dondururler bu yuzden eleman ekleme ve cikarma islemleri yapilamaz bu listerleri bu sekilde arrayListe cevirerek ekleme ve cikarma islemelerine devam edebiliriz.
    yeniListe5.add(302)
    yeniListe5.remove(1)
    println(yeniListe5)
}