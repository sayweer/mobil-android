package com.calisma.step4

open class superClassOrnek1 (var renk:String ,var boyut:Int){ //classlar kotlinde defoult olarak final ayarlanmistir bu bu claslardan sinif turetebilmek icin open anahtar kelimesini kullanmamiz gerekiyor.

    open fun yazdir()
    {
        println("rengimiz = $renk ,boyutumuz = $boyut")
    }

    final fun boyutDegistir(yeniBoyut:Int) //final anahtar kelimesi ile isaretlenmis fonksiyonları override yapamayiz.zaten default olarak final olarak isaretleniyorlar exstra final yazmamiza gerek yok override yapacaksak open kullanmaliyiz.
    {
        boyut = yeniBoyut
    }
}