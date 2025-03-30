package com.calisma.repeat1

class CreditCardPayment(val cardNumber : Int , val cardHolderName : String , val expiryDate : Int) :
    PaymentMethod {

    override fun processPayment(amount: Double): Boolean {
        if (amount > 1000)
        {
            println("Lutfen baska bir odeme yontemi deneyin 1000TL uzeri odemelerde guvenlik nedeniyle kredi kartı kullanilamiyor.")
            return false
        }
        else
        {
            println("${amount}TL miktarinda kredi kartiyla odeme basarili")
            return true
        }
    }

}