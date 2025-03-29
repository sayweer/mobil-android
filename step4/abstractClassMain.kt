package com.calisma.step7

fun main()
{
   // val deneme1 = Av()  // bu sekilde bir sinif olusturma denemesi muhtemelen basarisiz sonuclanacaktir cunku abstract siniflardan dogrudan obje olusturulamaz bu siniflari miras alan siniflardan nesne olusturarak method ve ozelliklerine erisilmelidir.

    val tavsan = Rabbit()

    tavsan.kac() // bu sekilde normal sinif yapisinda oldugu gibi abstract sinifin icerisinde abstract olarak tanimlanmayan ozellik ve methodlara da erisebiliyoruz.

    println(tavsan.ayakSayisi)
    tavsan.oluTaklidiYap()
}