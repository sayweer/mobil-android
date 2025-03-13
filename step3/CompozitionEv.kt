package com.calisma.step3

class CompozitionEv(var evSahibi:String ,var evKagitUzeirindeOlmayanGercekSahibi:String ,val perde:CompositionPerde ,val catal:CompositionCatal) {

    fun sahiplikSiralamasiniDegistir()
    {
        val geciciDegisken = evSahibi
        evSahibi = evKagitUzeirindeOlmayanGercekSahibi
        evKagitUzeirindeOlmayanGercekSahibi = geciciDegisken
    }
}