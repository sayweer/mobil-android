package com.calisma.step5

fun main()
{
    val superNesne = TipKontroluSuperClass()
    val subNesne = TipKontroluSubClass()

    if(superNesne is TipKontroluSuperClass)
        println("bu kod calisti cunku superNesne superclass turunde.")

    if(subNesne is TipKontroluSuperClass)
        println("bu kodda calisacak cunku alt siniflar da ust siniflarin bir parcasi gibi dusunuluyor.")

    if(superNesne is TipKontroluSubClass)
        println("bu sefer calismiyacak cunku superNesne alt sinifin turunden degil.")
        else{
            println(1)
    }

    if(subNesne is TipKontroluSubClass)
        println("bu sefer de kod calisacak cunku sub nesne sub sinifin turunden")

    if(superNesne !is TipKontroluSubClass)
        println("bu kod da calisicaktir cunku !is yaptigimiz zaman degilse yani tersi anlami katiyor")

    val baslangic =subNesne as TipKontroluSuperClass

    if (subNesne is TipKontroluSubClass)
        println("1")

    println(subNesne.yas)
    baslangic as TipKontroluSubClass // Burada çok sacma birsey yasiyorum mantigi nereden geliyor bilmiyorum bakis acim mi yanlis onu da bilmiyorum ama gercek tur olarak alt siniftan olusturulmus bir nesne upcastingle referansı dogrudan ust sinifa cevirildiginde bildiginiz gibi gercek turunu kaybetmiyor ama kendi turune ait ozelliklere erisimini kaybediyor. Ve bu sekilde bir downcast islemiyle tekrar eski ozelliklere erisilebiliyor. Ama as ile ust sinifa upcast yapmaya calissaydik ornegin baslangis as superClass gibi bu bir ise yaramiyor ve hala alt sinif ozelliklerine erismeye devam edebiliyor. erisimini kaybetmesini istiyorsak bu sonucu bir nesneye atamaliyiz sonra o nesne uzerinden bu ozelliklere erisememeye basliyoruz. ahhhhh cok sacma
    baslangic.ortalama               // yapilabilecek en iyi sey as ile sadece downcasting yapmaktir as ile upcasting yapmaya calismamaliyiz cünkü bunu zaten kendi otomatik olarak yapiyor ve as ile upcasting islemi kotlinde dogrudan desteklenmiyormus. en iyisi as ile sadece downcast yapmak upcasti otomatik yaptırmak.
    baslangic.yas
}