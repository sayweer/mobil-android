package com.calisma.repeat1

class CryptoPayment(val walletAddress : Int) : PaymentMethod{

    override fun processPayment(amount: Double): Boolean {

        val komisyon = amount/50
        println("toplam ucretin %2 si kadar bir islem ucreti tahsil edilmistir = $komisyon")
        println("toplam = ${amount + komisyon} Tl tahsil edilmistir.")
        return true
    }
}