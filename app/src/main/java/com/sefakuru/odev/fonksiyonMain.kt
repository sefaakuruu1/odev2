package com.sefakuru.odev
fun main() {

    println("sonucunuz:${Fonksiyon().dereceToFahrenheit(30.2)}")
    println("dikdortgeninizin cevresi:${Fonksiyon().dikdortgenCevre(10.5,5.6)} ")
    println("faktoriyel degeriniz:${Fonksiyon().faktoriyelBul(5)}")
    Fonksiyon().kelimeIcındeA("android bootcamp")
    println("iç acilar toplami :${Fonksiyon().icAciToplami(5)}")
    println("internet ucretiniz :${Fonksiyon().intKota(58)}")
    println("maasınız:${Fonksiyon().maasHesapla(gun=25)}")

}