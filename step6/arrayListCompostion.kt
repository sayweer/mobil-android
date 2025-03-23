package com.calisma.step6

fun main()
{
    val personeller = ArrayList<Personel>()
    for (i in 0..4)
    {
        println("lufen personelin adini giriniz = ")
        val isim = readLine() ?:""
        println("lutfen personelin soyadini giriniz = ")
        val soyAd = readLine() ?:""

        var yas: Int? = null
        while (true)
        {
            println("lutfen personelin yasini giriniz = ")
            yas = readLine()?.toIntOrNull()
            if (yas != null)
                break
            else
                println("girmis oldugunuz yas degeri gecerli degildir kontrol edip tekrar deneyiniz.")
        }

        var maas : Double? = null
        while (true)
        {
            println("lutfen personelin maasini giriniz = ")
            maas = readLine()?.toDoubleOrNull()
            if (maas != null)
                break
            else
                println("girmis oldugun maas degeri gercerli degil lutfen kontrol ederek tekrar dene.")
        }

        println("lutfen personelin mahalle bilgisini giriniz = ")
        val mahalle = readLine() ?:""

        println("lutfen personelin cadde bilgisini giriniz = ")
        val cadde = readLine() ?:""

        var binaNo : Int? = null
        while (true)
        {
            println("lutfen personelin bina nosunu giriniz = ")
            binaNo = readLine()?.toIntOrNull()
            if(binaNo != null)
                break
            else
                println("hatali giris yaptiniz lutfen kontrol edip gecerli bir bina no giriniz.")
        }

        var daireNo : Int? =null
        while (true)
        {
            println("lutfen personelin daire nosunu giriniz = ")
            daireNo = readLine()?.toIntOrNull()
            if (daireNo != null)
                break
            else
                println("hatali giris yaptiniz lutfen kontrol edip gecerli bir daire no giriniz")
        }
        val adres = Adres(mahalle ,cadde ,binaNo ,daireNo)
        personeller.add(Personel(isim ,soyAd , yas ,maas ,adres))
    }
    
    for(i in 0..4)
    {
        println("${i+1}. personelin ismi = ${personeller[i].isim}")
        println("${i+1}. personelin soyismi = ${personeller[i].soyAd}\n")
    }
}