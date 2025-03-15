package com.calisma.step4

fun main()
{
    val nesne1 = PolymorphismSubClass("seyit","sel")
    val nesne2 = PolymorphismSubClass("sel","seyit")

    val ciftler = ArrayList<PolymorphismSuperClass>()

    ciftler.add(nesne1)
    ciftler.add(nesne2)

    for(sayac in 0..1)
    {
       val nesne = ciftler[sayac] as PolymorphismSubClass   //downcast yapıp bir degiskene atamazsak eger kullanamayız
        println("isim1 = ${nesne.isim1}, isim2 = ${nesne.isim2}")
    }

    val ses:PolymorphismSuperClass = PolymorphismSubClass2()
    val ses2:PolymorphismSuperClass = PolymorphismSubClass("sey","sel") // buralarda da upcast yapiyoruz ve alt sinifa ait ozelliklerine erisimiyorlar artik.
    val ses3:PolymorphismSuperClass = PolymorphismSuperClass()
    ses.sesCikar()
    ses2.sesCikar()
    ses3.sesCikar()
}