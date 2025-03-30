package com.calisma.repeat1

interface PaymentMethod {

    fun processPayment(amount : Double): Boolean
}