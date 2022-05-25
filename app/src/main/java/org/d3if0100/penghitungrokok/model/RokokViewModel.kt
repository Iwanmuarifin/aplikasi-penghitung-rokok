package org.d3if0100.penghitungrokok.model

import androidx.lifecycle.ViewModel

class RokokViewModel : ViewModel() {

    fun cekRokok(jenisRokok: String, batang: String): String {
        if (jenisRokok == "Sampoerna") {
            if (batang == "sebatang") {
                return "Harga :" + " Rp.2.000"
            }
            if (batang == "tigaBatang") {
                return "Harga :" + " Rp.5.000"
            }
            if (batang == "setengahBungkus") {
                return "Harga :" + " Rp.12.000"
            }
        }

        // Garpit
        if (jenisRokok == "Garpit") {
            if (batang == "sebatang") {
                return "Harga :" + " Rp.2.000"
            }
            if (batang == "tigaBatang") {
                return "Harga :" + " Rp.5.500"
            }
            if (batang == "setengahBungkus") {
                return "Harga :" + " Rp.10.500"
            }
        }

        // Surya
        if (jenisRokok == "Signature") {
            if (batang == "sebatang") {
                return "Harga :" + " Rp.2.000"
            }
            if (batang == "tigaBatang") {
                return "Harga :" + " Rp.5.000"
            }
            if (batang == "setengahBungkus") {
                return "Harga :" + " Rp.10.500"
            }
        }
        if (jenisRokok != "Sampoerna" && jenisRokok != "Garpit" && jenisRokok != "Signature") {
            return "Maaf rokok yang anda inginkan tidak tersedia!"
        }
        return ""
    }
}