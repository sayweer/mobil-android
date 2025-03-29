package com.calisma.step7

 abstract class Av { // normal sinif yapisinin basina abstract keywordu eklenince abstract sinif olusturuluyor. ve bu sinifi mrias alabilmeleri icin basina open yazilmasina gerek yok

     fun kac() // bu sekilde icerisinde normal fonksiyon ve ozelliklerde tanimlanabiliyor. Ve bu normal ozellik ve metodları miras alan sinif override etmek zorunda değil.
     {
         println("tavsan kaciyor.")
     }

     abstract fun oluTaklidiYap() // ama bu sekilde abstract keywordu ile abstract yapilan method ve ozellikleri miras alan sinif override etmek zorunda.
     abstract var ayakSayisi: Int  // vee abstract olarak tanimlanan method ve ozelliklere ilk atamalar yapilmadan birakiliyor.

}