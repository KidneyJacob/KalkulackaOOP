package cz.jales
import kotlin.math.*

fun main(args: Array<String>) {
    val kalkulacka = Kalkulacka()

    println("Zadej 1. číslo: ")
    kalkulacka.prvni= readln().toDouble()
    println("Zadej 2. čislo: ")
    kalkulacka.druhe = readln().toDouble()

    println("Zadej znaménko operace kterou budete chtit provést:")
    println("+")
    println("-")
    println("*")
    println("/")
    var action = readln().toString()

    when (action){
        "+" -> println("Součet: ${kalkulacka.soucet()}")
        "-" -> println("Rozdíl: ${kalkulacka.rozdíl()}")
        "*" -> println("Součin: ${kalkulacka.nasobek()}")
        "/" -> println("Podíl: ${kalkulacka.deleno()}")
    }







}