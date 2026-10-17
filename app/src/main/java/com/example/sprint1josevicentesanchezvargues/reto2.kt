/*package com.example.sprint1josevicentesanchezvargues

import kotlin.random.Random

class reto2 {
    fun main(){
        /*1.- Completa el código para que imprima: “Mary is 20 years old”*/
        val name = "Mary"
        val age = 20
        println("$name is $age years old")

        /*2.- Declara de manera explícita el tipo de cada variable:*/
        val a: Int = 1000
        val b: String = "log message"
        val c: Double = 3.14
        val d: Long = 100_000_000_000_000
        val e: Boolean = false
        val f: String = "\n"

        /*3.- Tienes una dos listas: una con numeros rojos y otras con números verdes.
        Completa el código para imprimir cuántos números hay en total:*/
        val greenNumbers = listof(1, 4, 23)
        val redNumbers = listof(17, 2)
        val suma: Int = redNumbers.size + greenNumbers.size
        println("En total hay $suma números.")

        /*4.- Tienes un set de protocolos soportados por tu servidor. Un usuario
        pregunta por determinado protocolo y tu debes completar el código para
        informar si ese protocolo es sportado o no:*/
        val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
        val requested = "smtp"
        val isSupported = SUPPORTED.contains(requested.uppercase())
        println("Support for $requested: $isSupported")

        /*5.- Crea un mapa mutable que guarde el nombre de tres alumnos y su nota:*/
        var alumnos = mutableMapOf<String, Double>(
            "José" to 9.0,
            "David" to 8.5,
            "Carles" to 6.25
        )

        /*6.- Crea un juego donde ganas si al tirar dos dados salen los mismos números.*/
        val firstResult = Random.nextInt(6)
        val secondResult = Random.nextInt(6)
        if (firstResult == secondResult){
            println("Has ganado!!")
        } else {
            println("Perdiste. Vuelve a intentarlo!")
        }

        /*7.- Usa la expresión when y actualiza el siguiente programa para que imprima
        las acciones correspondientes según la letra que ponga:*/
        val button = "A"

        when (button) {
            "A" -> println("Yes")
            "B" -> println("No")
            "X" -> println("Menu")
            "Y" -> println("Nothing")
            else -> println("There is not such button")
        }
    }
}*/