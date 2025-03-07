package com.calisma.step1

class FonksiyonParametreleri {

    var marka = "head"
    var yil = 1963
    var ortakSayisi = 5
    var deger = 302

    fun degerDegistir(yeniDeger:Int)   //degisken tanimlar gibi parametre tanimliyoruz
    {
        deger = yeniDeger
    }
    fun degerArtis()
    {
        deger += 1
    }
    fun degerEksiltme()
    {
        deger -= 1
    }
    fun tumDegerleriDegistir(marka:String ,yil:Int ,ortakSayisi:Int ,deger:Int) //birden fazla parametre tanimliyabiliriz
    {
        this.marka = marka
        this.yil = yil
        this.deger = deger
        this.ortakSayisi = ortakSayisi
    }

    fun degerDegistir(yeniMarka:String)    // burada ise overloading gerçeklestirmis olduk. ayni isimde birden fazla fonksiyon yapmis olduk.
    {                                      // fonksiyonların parametre sayisi ya da dizilisinin farkli olmasi yeterli. Bu durum bize parametre cesitliligi sagliyor.
        this.marka = yeniMarka
    }
}