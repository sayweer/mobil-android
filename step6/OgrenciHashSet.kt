package com.calisma.step6

data class OgrenciHashSet(val no: Int ,val isim: String ,val puan: Int) { //data class olarak tanimladim cunku dosyada toString() metodunu kullanmak icin

    override fun hashCode(): Int { //burada sadece int turunden bir ifadeyi kullabaniliriz gibi gelebilir cunku degistirince hata veriyor ama diger turler icin de yontemler var fonksiyonun icerisinde kullanılan yontemler. Ayrica birden fazla paramaetreyi de kontol etmesini saglayabiliyoruz gerekirse bu durumlar icin ufak bir arastirma yeterli olacaktir cunku cok basit.
        return this.no
    }

    override fun equals(other: Any?): Boolean { // bu fonksiyonlari override ederek hangi kriterlere gore ogelerin ayni oldugunu belirlemek ve ona gore set yapisina ekleme yapmak icin kullanabiliriz.
        if(this.no == (other as OgrenciHashSet).no)
            return true
        else
            return false
    }
}