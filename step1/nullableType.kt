package com.calisma.step1


fun main() {
    var degisken: String? = null       //Global degisken olustururken null olarak olusturmak istersek '?' ile isaretlemek zorundayız.(null hatalı çokmelerden korunmak icin)

    var uzunluk: Int? = degisken?.length   //eger degisken null degil ise length fonksiyonu cagırılır ve degiskenin uzunlugu uzunluga atanir.
    //eger degisken null ise sonuc null doner ve uzunluga null atanır.

}