package com.calisma.step7

class BirinciThread : Thread() { //Thread olusturmanin iki yolundan biri olan Thread sinifini miras alarak olusturulmus BirinciThread

    override fun run() {
        for (i in 0..50)
        {
            println("Birinci Thread = $i")
            Thread.sleep(100) //statik bir fonksiyon olan bekletme fonksiyonu
        }

    }
}