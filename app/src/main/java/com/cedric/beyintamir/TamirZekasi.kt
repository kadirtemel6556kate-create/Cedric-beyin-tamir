package com.cedric.beyintamir

class TamirZekasi {
    fun arizaAnalizEt(kod: String): String {
        return when (kod) {
            "P0300" -> "Ateşleme hatası tespit edildi. Buji ve bobinleri kontrol et."
            "P0171" -> "Hava-Yakıt karışımı fakir. Oksijen sensörünü ve emme manifoldundaki kaçakları incele."
            "P0420" -> "Katalitik konvertör verimi düşük. Egzoz sistemini kontrol et."
            else -> "Kod analiz ediliyor... Yapay zeka beyin haritasını tarıyor."
        }
    }
}
