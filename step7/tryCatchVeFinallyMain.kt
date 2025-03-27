package com.calisma.step7

fun main()
{
    val a =18
    val b =0

    val dizim = Array<Int>(2){0} //[0,0]

    try {
        println("sonuc = ${a/b}")  //burada b eger sifir olur ise payda sifir olamayacagindan dolayi bir istisna firlatir.
        dizim[5] = 12  //burada oldugu gibi olusturdugumuz dizinin olmayan bir indexine erismeye calisirsak da yine baska bir istisna firlatilir.
    }catch (e: Exception){
        if(e is ArithmeticException)  // istersek bu sekilde aynı catch yapisi icerisinde bu sekilde ayri ayri hatalara ayri tepkiler verilmesini saglayabiliriz .
            println("payda sifir olamaz!!!")
        if(e is ArrayIndexOutOfBoundsException)
            println("dizinin boyutunu astiniz.")
    }finally {
        println("bu blok ise hata firlatilsa da firlatilmasa da her durumda calisir.")
    }

    println("----------------------------------------------------------------------")
    try {
        println("sonuc = ${a/b}")
        dizim[7] = 14
    }catch (e: ArrayIndexOutOfBoundsException){ //burada ise try icerisinde olusabilecek birden fazla hataya verilecek turlu tepkiler icin birden fazla catch yapisi kullanildi hangisini kullanmak isterseniz artik.
        println("dizinin boyutunu astiniz.")
    }catch (e: ArithmeticException){
        println("payda sifir olamaz!!!")
    }finally {
        println("yine her zaman calisan finally blogu")
    }

}