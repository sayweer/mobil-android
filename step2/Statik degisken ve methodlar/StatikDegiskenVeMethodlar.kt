package com.calisma.step2

//kotlinde statik degiskenler icin javada oldugu gibi dogrudan bir anahtar kelime yoktur onun yerine companinon object veya top-level tanimlamalar kullanilir.
//statik degiskenler ve metodlar nesne olusturulmadan erisilebilen yapılardır.

class StatikDegiskenVeMethodlar {

    val amac = "s"
    val sonuc ="s"
    val miktar = 19

    companion object //bu şekilde birnevi sinifin icerisinde bir nesne olusturuyor ve sonradan sinifin adini kullanarak bu siniftan tekrar bir nesne olusturmaya gerek kalmadan bu companinon object tanımının icerisindeki degisken ve metodlara erisebiliyoruz.
    {
        var isim = "seyit"
        var yas = 19
        var gelir = 16000

        fun buyume ()
        {
            this.yas += 1
        }

        fun yazdir()
        {
            println("kisi1 = $isim $yas $gelir")
        }
    }
}