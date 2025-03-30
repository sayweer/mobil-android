package com.calisma.repeat1

fun odemeAl(customer : Customer)
{

        while (true)
        {
            println("${customer.name} lutfen hesap tutarinizi tuslayiniz = ")
            var hesap = readLine()?.toDoubleOrNull()
            if (hesap != null)
            {
                while(true)
                {
                    println("lutfen hangi odeme yapacaginiz yontemi seciniz =\n1-kredi karti13500\n2-paypal\n3-kripto")
                    val odeme = readLine()?.toIntOrNull()
                    if (odeme != null)
                    {
                        when(odeme)
                        {
                            1 -> {
                                customer.makePayment(customer.krediKartim ,hesap)
                                break
                            }
                            2 -> {
                                customer.makePayment(customer.payPalHesabim ,hesap)
                                break
                            }
                            3 -> {
                                customer.makePayment(customer.kriptoHesabim ,hesap)
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
fun main()
{
    val kriptoHesapSeyit = CryptoPayment(123123)
    val kriptoHesapSel = CryptoPayment(321321)

    val payPalSeyit = PayPalPayment("seyitdegirmen@gmail.com")
    val payPalSel = PayPalPayment(null)

    val crediCardSeyit = CreditCardPayment(999 ,"Seyit" ,2029)
    val crediCardSel = CreditCardPayment(888 ,"Sel" ,2030)

    val seyit = Customer("seyit" ,16500.0 , kriptoHesapSeyit , crediCardSeyit , payPalSeyit)
    val sel = Customer("Sel" ,16500.0 ,kriptoHesapSel , crediCardSel , payPalSel)

    odemeAl(seyit)
    odemeAl(sel)
}