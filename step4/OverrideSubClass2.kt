package com.calisma.step4

class OverrideSubClass2 : OverrideSubClass1() {

    override fun oyuncuOldur() //Bir fonksiyonu overrida etmek istiyorsak sadece bir alt sınıfta değil miras yapısıyla birbirine bağlı sınıfların herhangi birinde overrride edebiiriz.
    { //Ama bir ust sinifta override etmis ve alt siniflarin birinde tekrar override etmek istiyorsak en son override ettigimiz yerde override yazisindan sonra tekrar open yazmamiz gerekiyor
        println("artik kimse olmeyecek aoisjdfashf")
    }
}