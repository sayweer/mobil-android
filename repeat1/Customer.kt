package com.calisma.repeat1

class Customer(val name : String , var balance : Double) {

    fun makePayment(paymentMethod : PaymentMethod ,amount : Double)
    {
        if (paymentMethod is CryptoPayment)
        {
            val topAmount = amount + amount/50
            if (balance > topAmount)
                if (paymentMethod.processPayment(amount))
                    balance -= topAmount
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