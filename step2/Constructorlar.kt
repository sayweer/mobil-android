package com.calisma.step2
//primary constructor
class Constructorlar(var nufus:Int ,val isim:String = "seyit") { //isim kisminda oldugu gibi default parametreler kullanabiliriz bu bize nesne olustururken istersek default degeri istersek kafamızdaki degeri kullanma sansı veriyor.

    init {
        println("nesne primary constructor kullanılarak basariyla olusturuldu!!!") //init blogu da primary constructorun parcasi sayiliyor ve nesne olusturuldugu anda constructorla beraber hemen calisiyor.
    }

    //constructor(var toplama:Int) : this(125,"se")    bu sekilde hata alırız cunku val var gibi anahtar sozcüklerle degisken tanımlamak sadece primary constructor icin mumkundur.
    constructor(nufus: Int, rakim:Int) : this(nufus,"sel")  //illa bir kod blogu yazmamiza gerek yok secondary constructor icin ama yazmıcaksak neden kullanalım ki :))
    {    //burada this anahtar kelimesi ile primary constructoru cagiriyoruz secondary constructor primary constructoru cagirmak zorundadir...
        println("nesne secondary constructor kullailarak basariyla olusturuldu!!!")
        var rakim = rakim   //buradaki rakima disaridan erisemeyiz cünkü sadece primary constructor kullanarak degisken tanimlayabiliyoruz... bu rakim sadece yerel olarak kullanilabilir.
    }
}