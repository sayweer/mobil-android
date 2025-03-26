package com.calisma.step6

fun main()//mapler key value ciftleridir. key uzerinden value degerine erisiriz. bir key in sadece bir value si olabilir. Benzer sekilde ayni anahtardan 2 tane olamaz.
{//map collectionlar duzenli siralanmaz rastgeledir.
    val map1 = mapOf(1 to "seyit" ,2 to "sel" ,3 to "afra") //mapOf() fonksiyonunu kullanarak immutable bir map olusturuyoruz sadece okuma islemi yapabilir. ekleme cikarma degistirme islemlerini maalesef yapamayiz.

    println(map1) //tum mapi yazdirdik.
    println(map1[2])  //key i 2 olan value degerini yazdirdik.

    val mutableMap = mutableMapOf<Int, String>()//gerektigi zaman key ve value degerlerinin turunu belirtebiliriz. ve mutable sekilde bir map yapisi olusturabiliriz
    mutableMap[1] = "seyit"
    mutableMap.put(2,"sel") // bu iki sekilde eleman ekleme yapilabilir.
    println(mutableMap)
    mutableMap.put(2,"afra") //bu sekilde veya diger eleman ekleme yontemiyle value degeri degistirilebilir.
    println(mutableMap)
    mutableMap.remove(2)//bu sekilde belirtilen key ve valuesi silinir
    println(mutableMap)
    mutableMap.clear()// bu sekilde tum elemanlar silinir.
    if(mutableMap.isEmpty())
        println("bu map bos!!!")

    val hashMap = hashMapOf(1 to "seyit" ,2 to "sel") //burada da gerektigi durumlarda key ve value turlerini belirtebiliriz ve mutable bir map yapisi olusturabliriz.hashMapOf ile olusturulan hashMap yapisi kullandigi hash algoritmasindan dolayi digerlerinden daha hizlidir.
    hashMap.put(3,"afra")
    println(hashMap)
}