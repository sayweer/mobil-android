package com.calisma.repeat1

class Customer(val name : String , var balance : Double ,val kriptoHesabim : CryptoPayment , val krediKartim : CreditCardPayment , val payPalHesabim : PayPalPayment) {

    fun makePayment(paymentMethod : PaymentMethod ,amount : Double)
    {
        if (paymentMethod is CryptoPayment)
        {
            val topAmount = amount + amount/50
            if (balance > topAmount)
            {
                if (paymentMethod.processPayment(amount))
                    balance -= topAmount
            }
            else
                println("Hesap bakiyeniz ${topAmount - balance}TL eksik")

        }
        else{
            if (balance > amount)
            {
                if (paymentMethod.processPayment(amount))
                {
                    balance -= amount
                    println("islem basarili kalan bakiyeniz = $balance")
                }
            }
        }


    }
}