package com.calisma.step2

//Bu fonksiyonlarda önemli husus tek parametresinin olması gerektiğidir tek parametre yoksa infix fonksiyon da yoktur.
//ya bir sınıfın içerisinde tanımlı bir fonksiyon olmalı ya da exstension fonksiyon olmalı (doğal bir dil görünümü sağlıyor)

infix fun Int.plus(number:Int):Int   // anahtar kelime = infix
{
    return this + number
}
fun main()
{
    println(3.plus(5))   //normalde bir fonksiyonu bu şekilde çağırıp kullanırız

    println(3 plus 5)   //ama infix fonksiyonları bu sekilde rahatca kullanabiliriz...

    val obj2 = ExstensionSinif()
    println(obj2.varlik)
    obj2.varlikGuncelle(125)// normal kullanim
    println(obj2.varlik)
    obj2 varlikGuncelle 302302 //infix fonksiyon basit kullanim
    println(obj2.varlik)
}