package com.calisma.step1

fun main()
{
    val nesne1 = LateinitKullanimi()
    nesne1.isim = "seyit"

    println(nesne1.isim)
    // println(nesne1.soyIsim)  boyle bir kullanimda hata alinacaktir cunku lateinit kullandigimiz zaman nesneyi kullanmadan önce deger atamasini yapmamiz gerekiyor yoksa hata aliyoruz (?) ya da (!!) kullanmak mantikli olabilir.

    nesne1.soyIsim = "degirmen"
    println(nesne1.soyIsim)

}