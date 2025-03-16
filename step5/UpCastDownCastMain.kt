package com.calisma.step5

fun main()
{
    //upcasting
  //  val nesne1 :UpcastVeDowncastSuperClass = UpCastVeDownCastSubClass()  bu sekilde upcast islemini yapmis olduk boylece alt siniftaki kendi ozelliklerine erisemeyecek sadece ust sinifin ozelliklerine erisebilecek.
    val nesne2 = UpCastVeDownCastSubClass()
    val aktarma : UpcastVeDowncastSuperClass = nesne2 //bu sekilde de upcasting yapabiliyoruz ve artık aktarma nesnesi alt sinif ozelliklerine erisemeyecek.

    nesne2.sessizKal()
    nesne2.sesCikar()      //bu sekilde hem kendi ozelliklerine hem de ust sinifin ozelliklerine erisebiliyor.

    aktarma.sesCikar()
   // aktarma.sessizKal()     ama bu sekilde upcast oldugu zaman sadece gittigi yerin ve ust sinifin ozelliklerine erisebiliyor alt siniftaki ozelliklerine erisemiyor.

    val aktarma2 = nesne2 as UpcastVeDowncastSuperClass // bu sekilde de upcasting yapilabilir ama buan gerek yok cunku kotlin bunu ototmatik olarak yapiyor.

    aktarma2.sesCikar()
   // aktarma2.sessizKal()  ayni sekilde upcastten dolayi hata alinir.

    //downcasting

   // val yeniNesne : UpCastVeDownCastSubClass = UpcastVeDowncastSuperClass()   bu sekilde olmaz cunku downcast yapmadan ust sinifi alt sinif türüne atayamiyoruz.

    val yeniNesne = UpcastVeDowncastSuperClass()
    //val referans : UpCastVeDownCastSubClass = yeniNesne as UpCastVeDownCastSubClass  // bu sekilde bir donusum yaparsak eger bize dür dönüşümüne uygun olmadığı için hata fırlatacaktır.
    val referans2 :UpCastVeDownCastSubClass? = yeniNesne as? UpCastVeDownCastSubClass  // ama bu sekilde hem baslangıcta belirttigimiz turun yanina soru isareti koyarak null bir deger de alabilecegini belirtiyoruz bunun yaninda as? kullanarak da donusum dogru bir sekilde yapilamazda o zaman null dondurmesini sagliyoruz.

    val son : UpcastVeDowncastSuperClass = UpCastVeDownCastSubClass() // burada upcasting yaptik

    val referans3 : UpCastVeDownCastSubClass = son as UpCastVeDownCastSubClass //bu sekilde gercek turu alt sinif olan bir nesne daha sonra upcastingle referans turu degismisse sonra onu downcast edip sorunsuz bir sekilde kullanabilriz.
    println(referans2) // gorundugu gibi referans2 null donuyor.
    son.sessizKal() // burada son nesnesini upcast etmis olmamiza ragmen alt sinif ozelligi olan sessizKal() fonksiyonunu cagirabilmesine sasirma cunku referans3 nesnesine atama yapmaya calisirken tekrar downcast yaptin askdfzdıj
    son.sesCikar()

}