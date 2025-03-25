package com.calisma.step6

fun main() //set yapilarinda elmanlar rastgele dizilir. Eklenme sirasina gore dizilmeleri soz konusu degil anklayacaginiz.
{           //set yapilarinin kullanilmasinin asil sebebi ayni elamani birden fazla kere ekleyemiyor olmamiz. Eklemeye calistiginda hata alimiyorsun ama eklenmiyor.
    val isimlerSet1 = hashSetOf<String>()  //kotlin standart kutuphanesini kullanarak bir hashset yapisi olusturuldu. burada ayni elemani birden fazla kere ekleyemez eklemeye calissak sorun cikmaz ama set e eklemez bosu bosuna yazmis oluruz amac da bu zaten. mutable yapida olusturur.
    isimlerSet1.add("seyit")
    isimlerSet1.add("sel")
    isimlerSet1.add("seyit")    //seyit isimini ikinci kere ekledim ama set yapisina eklenmedi.
    println(isimlerSet1.toString())

    val isimlerSet2 = HashSet<String>()    // bu sekilde java uzerinden bir hashset yapisi olusturuyoruz.
    isimlerSet2.add("seyit")
    isimlerSet2.add("sel")
    isimlerSet2.add("afra")
    println(isimlerSet2)

    val isimlerSet3 = setOf<String>("seyit" ,"sel" ,"afra")   // bu sekilde setOf ile olusturulan set yapilari immutable yapitadir uzerlerinde degisiklik yapamayiz ama okuma islemlerini yapabiliriz.

    val isimlerSet4 = mutableSetOf<String>()  // bu sekilde olusturulan set yapilari mutable yapidadir okuma ekleme ve silme islemleri yapilabilr.
    isimlerSet4.add("seyit")
    isimlerSet4.add("sel")
    isimlerSet4.add("afra")
    isimlerSet4.add("blablabla")
    println(isimlerSet4)
    isimlerSet4.remove("blablabla")
    println(isimlerSet4)
}