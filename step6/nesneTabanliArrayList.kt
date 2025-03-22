package com.calisma.step6

fun main()
{
    val balkon1 = Balkon(52,3)
    val balkon2 = Balkon(12,1)
    val balkon3 = Balkon(23,2)

    val balkonlar = ArrayList<Balkon>()
    balkonlar.add(balkon1)
    balkonlar.add(balkon2)
    balkonlar.add(balkon3)

    for(balkon in balkonlar)
    {
        println("balkonun boyutu = ${balkon.m2}")
        println("balkonun kapi sayisi = ${balkon.kapiSayisi}\n")
    }
}