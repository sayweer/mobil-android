package com.calisma.step5

open class InterfacelerClass :Interface1 {
    override var isim: String = "seyit"

    override fun yazdir1() {
        println(isim)
    }

    override fun yazdir2(): String {
        return isim
    }
}