package com.sefakuru.odev

class Fonksiyon {
    fun dereceToFahrenheit(derece:Double):Double=(derece*1.8)+32

    fun dikdortgenCevre(uzunKenar:Double,kisaKenar:Double):Double {
        var cevre: Double = (uzunKenar + kisaKenar) * 2
        return cevre
    }

    fun faktoriyelBul(sayi:Int):Int{
        var fakt=1
        for(num in 1..sayi){
            fakt=fakt*num
        }
        return fakt
    }
    fun kelimeIcındeA(kelime:String) {

        var sayac = kelime.count { it == 'a' }
        println("${kelime} kelimesinde ${sayac} tane 'a' harfi var.")
    }

    fun icAciToplami(kenar:Int):Int{
        var kenarSay=kenar
        return (kenar-2)*180

    }

    fun intKota(gb:Int):Int {
        var ucret = 0
        if (gb <= 50) {
            return 100
        } else {
            return 100 + (gb - 50) * 4
        }
    }

    fun maasHesapla(gun:Int):Int{
        if (gun==20){
            return 160*10
        }else{
            return (20*8*10)+(gun-20)*20*8
        }
    }
}