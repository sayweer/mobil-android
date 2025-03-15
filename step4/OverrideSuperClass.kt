package com.calisma.step4

import kotlin.random.Random

open class OverrideSuperClass {

    val hayattakiOyuncular = arrayListOf("seyit","sel","ucuncuKisi","dorduncuKisi","besinciKisi")
    val oluOyuncular = ArrayList<String>()
    open fun oyuncuOldur()
    {
        var olecekOyuncu = Random.nextInt(0,5)
        oluOyuncular.add(hayattakiOyuncular[olecekOyuncu])
        hayattakiOyuncular.removeAt(olecekOyuncu)
    }
}