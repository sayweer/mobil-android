package com.calisma.step7

class Rabbit : Av() {

    override fun oluTaklidiYap() {  // bu sekilde abstract sinifin abstrasct ozellik ve methodlarini doldurmaliyiz override ederek.
        println("olmus gibi yapiliyor.")
    }

    override var ayakSayisi: Int = 4

}