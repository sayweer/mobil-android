package com.calisma.repeat1

fun main()
{
    val seyit = Customer("Seyit" ,16500.0)
    val sel = Customer("Sel" ,16500.0)

    val kriptoHesapSeyit = CryptoPayment(123123)
    val kriptoHesapSel = CryptoPayment(321321)

    val payPalSeyit = PayPalPayment("seyitdegirmen@gmail.com")
    val payPalSel = PayPalPayment(null)

    val crediCardSeyit = CreditCardPayment(999 ,"Seyit" ,2029)
    val crediCardSel = CreditCardPayment(888 ,"Sel" ,2030)

    while (true)
    {
        println("seyit lutfen hesap tutarinizi tuslayiniz = ")
        var hesap = readLine()?.toDoubleOrNull()
        if (hesap != null)
        {
            while(true)
            {
                println("lutfen hangi odeme yapacaginiz yontemi seciniz =\n1-kredi kartı\n2-paypal\n3-kripto")
                val odeme = readLine()?.toIntOrNull()
                if (odeme != null)
                {
                    when(odeme)
                    {
                        1 -> {
                            seyit.makePayment(crediCardSeyit ,hesap)
                            break
                        }
                        2 -> {
                            seyit.makePayment(payPalSeyit ,hesap)
                            break
                        }
                        3 -> {
                            seyit.makePayment(kriptoHesapSeyit ,hesap)
                            break
                        }
                        else -> println("olmayan bir odeme secenegini secmeye calistiniz lutfen tekrar deneyin!!!")
                    }
                }
                else
                    println("hatali bir tuslama yaptiniz lutfen tekrar deneyin")
            }
            break
        }
        else
            println("lutfen dogru hesap tutarini giriniz")
    }


    while (true)
    {
        println("sel lutfen hesap tutarinizi tuslayiniz = ")
        var hesap = readLine()?.toDoubleOrNull()
        if (hesap != null)
        {
            while(true)
            {
                println("lutfen hangi odeme yapacaginiz yontemi seciniz =\n1-kredi kartı\n2-paypal\n3-kripto")
                val odeme = readLine()?.toIntOrNull()
                if (odeme != null)
                {
                    when(odeme)
                    {
                        1 -> {
                            sel.makePayment(crediCardSel ,hesap)
                            break
                        }
                        2 -> {
                            sel.makePayment(payPalSel ,hesap)
                            break
                        }
                        3 -> {
                            sel.makePayment(kriptoHesapSel ,hesap)
                            break
                        }
                        else -> println("olmayan bir odeme secenegini secmeye calistiniz lutfen tekrar deneyin!!!")
                    }
                }
                else
                    println("hatali bir tuslama yaptiniz lutfen tekrar deneyin")
            }
            break
        }
        else
            println("lutfen dogru hesap tutarini giriniz")
    }

}