package com.calisma.step3

enum class CompositionPerde(var adet:Int) {
    DESENLI(0),
    DESENSIZ(0);

    fun perdeAl(miktar:Int)
    {
        adet += miktar
    }
}