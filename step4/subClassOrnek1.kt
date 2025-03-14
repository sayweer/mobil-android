package com.calisma.step4

class subClassOrnek1:superClassOrnek1("seyit" , 187) {

    override fun yazdir() //bir fonksiyonu override ediyorsak bunu alt sinifta overrida anahtar kelimesi ile isaretlemek zorundayiz.
    {
        println("buyuk bir bosluk             ")
    }
}