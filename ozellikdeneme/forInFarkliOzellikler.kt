package com.calisma.ozellikdeneme

fun main()
{
    val testArray = ArrayList<String>()
    testArray.add("s")
    testArray.add("se")
    testArray.add("sey")
    testArray.add("seyi")
    testArray.add("seyit")

    for(isim in testArray) //normal kullanim
    {
        println(isim)
    }
    /*
    for (index in 0..testArray.size)
    {
        println(testArray[index])      //burada buyuk ihtimalle liste disina cikmaya calistigimiz icin IndexOutOfBoundsException hatasi firlatilicaktir.
    }*/

    for (index in 0 until testArray.size) //until 1 eksiğine kadar yazdırıyor(testArray.size-1 de yapabiliriz amaaan gidecek yol mu yok.)
    {
        println(testArray[index])
    }

}