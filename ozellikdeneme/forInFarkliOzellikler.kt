package com.calisma.ozellikdeneme

import android.R
import java.util.InputMismatchException
import java.util.Scanner
import kotlin.random.Random

fun main() {
    val testArray = ArrayList<String>()
    testArray.add("s")
    testArray.add("se")
    testArray.add("sey")
    testArray.add("seyi")
    testArray.add("seyit")

    for (isim in testArray) //normal kullanim
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


    for (index in 0 until testArray.size step 2) {
        println(testArray[index])
    }

    for (index in (testArray.size - 1) downTo 0 step 2) // down to deyince tersden geliyor indexler
    {
        println(testArray[index])
    }

    for ((index, harfObegi) in testArray.withIndex())//dizilerle kullanıldiginda index degeriyle beraber alma
    {
        println("$index.index degeri = $harfObegi\n")
    }

    val isim = arrayOf("seyit", "ali", "degirmen")
    val isim2 = arrayOf<String>("seyit", "ali", "degirmen")
    val isim3 = Array<Int>(size = 5) { 0 }//{0,0,0,0,0}

    val okuyucu = Scanner(System.`in`)
    println("lutfen bir tam sayi giriniz = ")
    var sayi = 5
    try {
        sayi = okuyucu.nextInt()
    }catch (e : InputMismatchException)
    {
        println("istenilen ozelliklerde bir deger tuslamadiniz sayi varsayilan olarak 5 alinacak!!!")
    }finally {
        println("asigin kaderi-merve ozbey #reklam xawıeyfasdf")
    }
    for (tekrar in 1..sayi)
    {
        println("$tekrar.sayi = ${Random.nextInt(0,302)}")  // rastgele sayi 0 dahil 302 haric 0 until 302 misali yahut 0..301
    }
}