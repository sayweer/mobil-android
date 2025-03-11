package com.calisma.step3

class EnumarationClass2 {

    fun descriptionEnumaration(Irklar : EnumarationClasss) : String
    {
        return when(Irklar)
        {
            EnumarationClasss.TURK -> "turk isim sayisi  =  12500"
            EnumarationClasss.ISPANYOL -> "ispanyol isim sayisi = 9300"
            EnumarationClasss.FRANSIZ -> "fransiz isim sayisi =10000"
            EnumarationClasss.INGILIZ -> "ingiliz isim sayisi = 10500"
        }
    }
}