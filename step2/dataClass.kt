package com.calisma.step2

fun main()
{
    val nesne1 = DataClasss("seyit" , 19)

    nesne1.buyume()
    println(nesne1.yas)

    println(nesne1) //DataClasss sinifini data olarak isaretlemedigimiz durumda bu yazdirmanin ciktisi sacma birsey oluyor. ama data olarak tanimladigimiz zaman anlamli bir cikti aliyoruz. bu durum toString() metodunu data ismiyle beraber kendi eklediginden dolayi oluyor.

    val nesne2 = DataClasss("seyit",20)

    println(nesne1 == nesne2)  //data sinif sayesinde nesnelerin verilerini fazladan fonksiyon yazmadan karsilastirabiliyoruz. equals() fonksiyonunun kendisi yazıyor.

    val nesne3 = nesne2.copy(isim = "sel") // data sinifi sayesinde copy fonksiyonunu yazmadan bir nesneyi kopyalayip istedigimiz kismini degistirip yeni bir nesne olusturabiliyoruz.

    val people = listOf(DataClasss("sel",19),DataClasss("seyit",19))

    for ((isim,yas) in people)    // data class sayesinde degerler otomatik olarak parcalanir ozellikle listelerle calisirken buyuk kolaylik tanir bize.
    {
        println("$isim $yas yasinda")
    }
}