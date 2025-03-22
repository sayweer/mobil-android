package com.calisma.step6

fun main()  //kotlinde collection type 3 ayrılıyor bunlardan birisi Listeler biz List yapilarindan mutable ve java temelli olan daha uyumlu bir liste olan ArrayList i gorecegiz suanlik.
{          //add() fonksiyonuyla veri ekleyebiliyoruz.
    val list1 = ArrayList<String>()
    list1.add("seyit")
    list1.add("sel")
    list1.add("ucuncu sahis")
    list1.add("dorduncu sahis")
    list1.add("besinci sahis")

    for (list in list1)
    {
        println(list)
    }

    println("----------------------------")

   // println(list1.toString())      kotlinde bu sekilde toString fonksiyonunu eklemenize gerek yok kotlin println kullanıldıgı zaman kendisi ekliyor otomatik olarak.
    println(list1) //goruldugu gibi ikisi de ayni output u veriyor.

    list1.add(2,"ikinci sahis") // bu sekilde basta girilen index degerine eleman ekleyebiliyoruz belirttigimiz indexteki eleman silinmiyor o ve devamindaki indexler ileriye kayiyor.
    println("-------------------")

    println(list1) //tam da bekledigimiz gibi sonuc verdi.
    println("**************")

    val isim1 = list1[1]
    val isim2 = list1.get(1) //bu iki blok da ayni ise yariyor.

    println(isim1)
    println(isim2)      //kanitlamis olduk.

    //buradan sonrasi ArrayList islemleri***

    val list2 = ArrayList<Int>()
    println(list2.isEmpty()) //isEmpty() fonksiyonu listenin boş olup olmadigini kontrol ediyor. Eger bos ise true dolu ise false donduruyor.
    println(list1.isEmpty())

    if (!list1.isEmpty())     //bos degilse listeyi yazdir.
    {
        println(list1)
    }
    else{
        println("bu liste bos")
    }
    if (!list2.isEmpty())       //bos degilse listeyi yazdir
    {
        println(list2)
    }
    else{
        println("bu liste bos")
    }
    println("---------------------------------")

    val list3 = ArrayList<Int>()
    list3.add(4)
    list3.add(5)
    val miktar = list3.count()   // count() fonksiyonu bir listenin veya dizinin içerisinde ne kadar öğe olduğunu döndürür.
    println(miktar)

    list3.add(6)
    list3.add(7)
    list3.add(8)
    list3.add(9)
    list3.add(10)

    val miktar2 = list3.count{it % 2 ==0} //count() fonksiyonuyla suslu paranteze yazdigimiz sartlari saglayan oge sayisini da dondurebiliriz...
    //burada cift olan sayilari yani 4 ,6 ,8 ve 10 u sayarak 4 sayisini dondurecektir.

    println(miktar2)

    val uzunisim = "seyyitseyitseyyitseyid"
    val uzunlugu = uzunisim.count()
    println(uzunlugu) //stringlerde bitis karakterini saymiyor.

    val miktar3 = list3.size   //size ozelligi de bize ne kadar eleman oldugunu dondurur ama bir ozelliktir ve her cagırıldıgında yeniden hesaplanmaz bu yuzden daha hızlıdır.
    println(miktar3)         //eger normal kullanımda tum elemanlarin sayisini ogrenmek istiyorsak size bizim icin bicilmis kaftan eger bir kosula gore eleman sayisi dondureceksek bu sefer de count() fonksiyonu kullanilmali.

    println("-------------")

    val list4 = ArrayList<Int>()

    for (sayi in 11..20)
        list4.add(sayi)

    println(list4.first())  //listeye eklenen ilk elemani donduruyor.
    println(list4.last())      //listeye eklenen son elemani donduruyor.

    if(list4.contains(89))     //parametre olarak girilen degerin belirtilen listede bulunup bulunmadigini kontrol ediyor. varsa true yoksa false donuyor.
        println("15 bu listede bulunuyor.")
    else
        println("15 bu listede bulunmuyor.")

    println(list4.max()) //listede bulunan en buyuk elemani dondurur. eger string ise alfabetik siraya gore.
    println(list4.min())   //listede bulunan en kucuk elamni dondurur. eger string ise alfabetik siraya gore.

    println("*****************")
    println(list4)
    list4.reverse() //reverse() fonksiyonu yeni bir koleksiyon olusturmadan mutable listelerdeki elemanlarin index siralamalarini degistirerek ters cevirir.
    val list5 = list4.reversed()  //reversed() fonksiyonu ise orijinal listeye dokunmaz listeyi ters cevirip doner.
    println(list4)

    println(list4.first())   //anladık ki first ve last fonksiyonlari ekleme sirasina gore degil listedeki yerlerine gore dondurma yapiyorlar. listede elemanlarin yeri degistiginde dondurecekleri elemanlar da degisebiliyor.

    println("555555555555555555555555555555555555555")
    println(list4)
    list4.sort() // sort() fonksiyonu duzenleme yapiyor dogrudan listeyi degistiriyor. varsayilan olarak kucukten buyuge siraliyor.
    println(list4)
    list4.sort()
    println(list4)

    list4.remove(18) //remove() fonksiyonu parametre olarak verilen degeri bulup siliyor sonraki degerlerin ise indexini birer indiriyor.  // varsa ki var 18 sayisini silecek.
    list4.removeAt(2)   //removeAt() fonksiyonu parametre olarak belirtilen indexteki elemani siler sonraki eleamnlarin indexini birer azaltir.   // varsa ki var ikinci index deki 13 sayisini silecek.
    println(list4)

    println("**************************************************")
    if (!list4.isEmpty())
        println("bu listede eleman var")
    else
        println("bu listede eleman falan yok bos liste")

    println(list4)
    list4.clear()    // clear() fonksiyonu listedeki tum elemanlari siler.
    if (!list4.isEmpty())
        println("bu listede eleman var")
    else
        println("bu listede eleman falan yok bos liste")
}