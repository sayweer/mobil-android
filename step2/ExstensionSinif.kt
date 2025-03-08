package com.calisma.step2

class ExstensionSinif {

    var boyut =123
    val isim = "seyit"
    var varlik = 99999999

    infix fun varlikGuncelle(varlik:Int)
    {
        this.varlik = varlik
    }
}