package com.calisma.step1

class VarargParametre {

    var toplam = 0

    fun sonucDegistir(vararg numbers:Int)
    {
        for(number in numbers)
        {
            toplam += number
        }
    }
}