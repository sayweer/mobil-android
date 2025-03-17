package com.calisma.step5

class InterfacelerClassSub : InterfacelerClass() {

    override fun yazdir1() { // interfacelerde fonksiyonlar alt siniflarda tekrar override edilecegi zaman open anahtar kelimesini yazmaya gerek yoktur cunku interfaceden gelen ozellikler zaten override edilebilir durumdadir.
        super.yazdir1()
        println("ve \nsel")
    }
}