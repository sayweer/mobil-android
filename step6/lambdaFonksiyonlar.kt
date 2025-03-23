package com.calisma.step6

fun main()
{
   /* val sayilar = ArrayList<Int>()
    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)            //bu sekilde de liste olusturabiliriz ama goruldugu gibi eleman ekleme kismi bu islem icin baya uzun suruyor.
    sayilar.add(4)
    sayilar.add(5)
    sayilar.add(6) */

    val sayilar = listOf(1,2,3,4,5,6,7,8,9,10)
    val tekSayilar = sayilar.filter{it % 2 != 0} //burada goruldugu gibi liste islemleri icin lambda fonksiyonlar olmazsa olmazdir.
    println(tekSayilar)

    fun islemYap(a: Int ,b: Int ,islem : (Int ,Int) -> Int): Int  //bu sekilde gelismis bir fonksiyona parametre olarak verilebilirler.
    {
        return islem(a,b)
    }

    val carpma = {x : Int,y : Int -> x*y}    //fonksiyonda belirtilen sekillerde tanimlanir.
    val bolme = {x: Int, y: Int -> x/y}
    val toplama = {x: Int ,y: Int -> x+y}
    val cikarma = {x: Int ,y: Int -> x-y}

    println(islemYap(13,5,carpma))  //bu sekilde de kullanilir.
    println(islemYap(90,2,bolme))


    val sonuc = islemYap(10,2) { x, y -> x - y } // bu sekilde tek seferlik olarak da kullanilabilir.Yapilacak islemi baska bir degiskende degil de dogrudan burada tutuyoruz.
    println(sonuc)

    val gelecegiTahminEt : () -> Unit = {println("muhtemel 2 yil sonra seyit ama sel..")}   // bu sekilde labda fonksiyonu bir degisken olarak saklayip daha sonsa cagirabiliriz. Burada ici bos parantez () fonksiyonun parametre almayacagini belirtiyor. Unit ise geri donus degerinin olmayacagini belirtiyor.

    gelecegiTahminEt()
}