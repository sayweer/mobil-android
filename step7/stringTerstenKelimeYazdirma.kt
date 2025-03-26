package com.calisma.step7

fun terstenYazdir(stringg : String)
{
    for(i in stringg.length-1 downTo 0)
    {
        print(stringg[i])
    }
}

fun main()
{
    println("Lutfen ters yazilmasini istediginiz String ifadeyi yaziniz = ")
    val str: String = readLine().orEmpty() // ya da toString() kullanilabilirdi ama bu daha guvenli.

    terstenYazdir(str)
}