package com.calisma.step6

fun main()
{
    val ogrenci1 = OgrenciHashSet(1 ,"seyit" ,999)
    val ogrenci2 = OgrenciHashSet(2 ,"sel" ,999)
    val ogrenci3 = OgrenciHashSet(3 ,"afra" ,892)
    val ogrenci4 = OgrenciHashSet(1 ,"ali" ,999) // burada goruldugu gibi no su onceki ogrencilerden birisiyle ayni olan bir ogrenci nesnesi olusturduk ve daha once bahsettigimiz gibi set yapilarinin amaci bu tur ayni olmasi durumunda eklenememesiydi ama bu ogrenci tum parametrelerin ayni olmadigi durumlarda eklenebiliyor.
    //bunu istememiz halinde engelleyebiliyoruz.

    val ogrenciler = HashSet<OgrenciHashSet>()
    ogrenciler.add(ogrenci1)
    ogrenciler.add(ogrenci2)
    ogrenciler.add(ogrenci3)
    ogrenciler.add(ogrenci4)

    println(ogrenciler)

    val uzay1 = Uzay(1)
    val uzay2 = Uzay(2)
    val uzay3 = Uzay(3)
    val uzay4 = Uzay(1)//tek parametre olunca aynı olanları eklemiyor birden fazla parametre olunca kafası karısiyor sistemin ))
    val uzay = HashSet<Uzay>()
    uzay.add(uzay1)
    uzay.add(uzay2)
    uzay.add(uzay3)
    uzay.add(uzay4)

    println(uzay)

    println("******************************")
    val ogrenci5 = OgrenciHashSet(5 ,"ahmet" ,434)
    val ogrenci6 = OgrenciHashSet(2 ,"riza" ,323) //numarasi baska bir elemanla ayni oldugu icin artik set yapisina eklenmiyor.
    ogrenciler.add(ogrenci5)
    ogrenciler.add(ogrenci6)

    println(ogrenciler)
}