package com.calisma.step6

fun main()
{
    val aList1 = ArrayList<String>()
    aList1.add("mavi kalem")
    aList1.add("kirmizi kalem")
    aList1.add("yesil kalem")

    for (kalem in aList1)   // bu sekilde tek tek erisebiliyoruz
        println(kalem)

    for ((index ,kalem) in aList1.withIndex()) //indexiyle beraber erisme.
        println("index nuamrasi = $index ,kalem = $kalem")
}