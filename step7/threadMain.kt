package com.calisma.step7

fun main()
{
    val birinciThread = BirinciThread() //Thread sinifi miras alinarak olusturulmus thread nesne bu sekilde olusturulur.
    birinciThread.start() //normalde bu sinifin nesnesindeki fonksiyona erismek icin birinciThread.run() kullanirdik ama eger oyle kullansaydik thread seklinde olmazdi.
    val ikinciThread = Thread(IkinciThread()) //Runnable interfacesi kullanilirak olusturulan thread nesne bu sekilde olusturulur.
    ikinciThread.start()

    for (i in 400..450)  //diger iki islem thread yapida oldugu icin baska islemler yapilirken de yapilabiliyorlar bu yuzden onlar basladiktan sonra bu da calismaya basliyor bu calismaya baslamak icin digerlerinin bitmesini beklemiyor o yuzden bu da akisa dahil oluyor bu yuzden bu tarz durumlara da main thread diyoruz cok gerekli mi hayır ama yine de bil.
    {
        println("Main Thread = $i")
        Thread.sleep(100)
    }

}