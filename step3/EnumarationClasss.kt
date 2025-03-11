package com.calisma.step3

enum class EnumarationClasss(var isimSayisi:Int, var enPopuler:String){ //burada ekledigimiz parametre sayisi kadar asagida enum degiskenlere ozellik eklemek zorundayiz ve siralama da ona gore hazirlanmali.
    TURK(12500,"Alparslan"),
    FRANSIZ(10000,"Gabriel"), //enum ozellikleri sinifin en basinda tanimlanmalidir daha sonrasinda istege bagli olarak fonksiyon ve normal degiskenler tanimlanabilir.
    INGILIZ(10500,"Michael"),
    ISPANYOL(9300,"Antonio");

    fun isimEkle(eklenenSayi:Int)
    {
        this.isimSayisi += eklenenSayi
    }
}