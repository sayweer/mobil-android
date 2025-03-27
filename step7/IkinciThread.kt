package com.calisma.step7

import kotlinx.coroutines.Runnable

class IkinciThread : Runnable { //Thread olusturmanin iki yolundan biri olan Runnable interfacesini kullanarak olusturulmus IkinciThread

    override fun run() {
        for (i in 200..250)
        {
            println("Ikinci Thrad = $i")
            Thread.sleep(100) //parametre milisaniye olarak aliniyor.
        }

    }
}