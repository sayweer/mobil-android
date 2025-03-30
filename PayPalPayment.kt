package com.calisma.repeat1

class PayPalPayment (val eMail : String?) : PaymentMethod {

    override fun processPayment(amount: Double): Boolean {
        if (eMail == null)
            {
                println("gecerli bir eMail girmediginiz icin odeme alinamadi lutfen baska bir yontem deneyin.")
                return false
            }
        else{
            println("$eMail adresi uzerinden $amount TL odeme basarili bir sekilde alinmistir.")
            return true
        }
    }
}