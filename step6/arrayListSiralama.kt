package com.calisma.step6

import java.util.concurrent.atomic.AtomicReferenceArray
import kotlin.math.abs

fun main() // sadece sort() fonksiyonunu kullandigimiz zaman varsayilan olarak kucukten buyuge sekilde siralama yapiyor. ve bunu yaparken orijinal listeyi degistirerek yapiyor. yeni bir listeye atamak icin veri dondurmuyor.
{
    val zurnaKadarUzunAdlar = ArrayList<String>()
    zurnaKadarUzunAdlar.add("ahmet") //0. index
    zurnaKadarUzunAdlar.add("mehmet") //1. index
    zurnaKadarUzunAdlar.add("okan")  //2. index
    zurnaKadarUzunAdlar.add("acun")  //3. index
    zurnaKadarUzunAdlar.add("malik")  //4. index
    zurnaKadarUzunAdlar.add("seyit")  //5. index
    zurnaKadarUzunAdlar.add("yusuf")  //6. index
    zurnaKadarUzunAdlar.add("sel")  //7. index
    zurnaKadarUzunAdlar.add("firat")  //8. index

    println(zurnaKadarUzunAdlar)
    zurnaKadarUzunAdlar.sort()               //bu kisim onceki anlattigimiz kismin tekrari gibi birsey
    println(zurnaKadarUzunAdlar)

    val balkonlar = ArrayList<Balkon>()
    val balkon1 = Balkon(15,1)
    val balkon2 = Balkon(23,2)
    val balkon3 = Balkon(23,1)
    val balkon4 = Balkon(25,1)
    val balkon5 = Balkon(43,4)
    val balkon6 = Balkon(43,3)
    balkonlar.add(balkon1)
    balkonlar.add(balkon2)
    balkonlar.add(balkon3)
    balkonlar.add(balkon4)
    balkonlar.add(balkon5)
    balkonlar.add(balkon6)

    val siralanmisListe1 = balkonlar.sortedWith (compareBy { it.m2 }) //bu sekilde istediğimiz ozellige gore tek tek siralayabliliriz.
    for (balkon in siralanmisListe1)
    {
        println(balkon.m2)
        println(balkon.kapiSayisi)
        println("--------------")
    }

    println("*********************************************************************")
    val siralanmisListe2 = balkonlar.sortedWith (compareBy<Balkon> { it.m2 }. thenBy {it.kapiSayisi})   //burada iki kritere göre siralama yaptik. once m2 ye gore kucukten buyuge siraladi eger m2 ler esit ise kapiSayisina gore siralama yapti.
    for (balkon in siralanmisListe2)
    {
        println(balkon.m2)
        println(balkon.kapiSayisi)
        println("--------------")
    }
}