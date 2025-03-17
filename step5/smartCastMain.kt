package com.calisma.step5

fun main()  // Smartcast islemi is ile tur kontrolu yaptigimiz zaman o kod blogunun icerisinde referans turunun cast edilmesidir
{           //sadece val tanimlanan turlerde smartCast islemi gerceklesiyor var ile olusturulan turler icin otomatik olarak smartcast islemi yapilmaz.
            // smart cast islemi kalici degildir kontrolun yapildigi kod blogu icinde gecerlidir sonra normal haline geri doner.

    val subNesne : SmartCastSuperClass= SmartCastSubClass()
    val subNesne2 = SmartCastSubClass()

    if (subNesne is SmartCastSubClass) // iste burada smart cast yapıldı.
    {
        println(subNesne.supers)
    }

   /* if(subNesne2 is SmartCastSuperClass)     bu sekilde bir sey yapmamiza gerek yok cunku zaten subNesne2 nin superclas yani ust sinifin bir parcasi bu yuzden bu sekilde bir kullanimda smartcast islemi gerceklesmez
    {
        println(subNesne2.subs)
        println(subNesne2.supers)
    } */
}     // smartCast genel olarak ust sinif referansli bir nesne uzerinden alt sinif ozelliklerine erismek istendigi zaman gerekir.