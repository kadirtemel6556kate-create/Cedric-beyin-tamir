package com.cedric.beyintamir

class TamirZekasi {
    fun tamirOnerisi(hataKodu: String): String {
        return when (hataKodu.uppercase()) {
            "P0300" -> "AI Analizi: Ateşleme sistemi zayıf. Buji kablolarını ve bobin voltajını ölç."
            "P0101" -> "AI Analizi: Hava akış (MAF) sensörü hatalı veri gönderiyor. Sensörü temizle veya soketi kontrol et."
            "U0100" -> "AI Analizi: Motor Beyni (ECU) ile iletişim koptu. Şase kablolarını ve ana röleyi kontrol et."
            else -> "Yapay Zeka: Arıza kodu veritabanında taranıyor, lütfen OBD2 bağlantısını kesmeyin."
        }
    }
}
