package com.calisma.ozellikdeneme

fun main()
{
    fun mesajFormatlari(prefix : String ,vararg mesaj : String)
    {
        for((index ,msj) in mesaj.withIndex())
        {
            println("$prefix ${index + 1} = $msj")
        }
    }


    mesajFormatlari("yangin" ,"tahliye edin" ,"agzınızı nemli bezle kapatin" ,"once kendinizi kurtarin :)" ,"yapabiliyorsaniz sonra baskalarina yardim edin" ,"falan filan intermilan")
}