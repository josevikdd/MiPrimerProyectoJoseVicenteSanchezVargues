/*package com.example.sprint1josevicentesanchezvargues

class reto3 {
    fun main() {
        /*1.- Crea un programa donde:
        Pide al usuario una contraseña y comprueba que:
            Tiene al menos ocho caracteres.
            Contiene una mayúscula.
            Contiene una minúscula.
            Contiene un número.
            No contiene espacios.
        El programa debe indicar todos los requisitos que incumple, no solamente
        el primero.
        Ejemplo:
        Contraseña no válida: - Falta una letra mayúscula. - Falta un número.*/
        println("Ingrese su contraseña: ")
        val password: String = readln()

        var message: String = ""
        var errors: Boolean = false

        if (password.length < 8){
            errors = true
            message += " - Tiene menos de 8 caracteres."
        }
        if (!password.any {it.isUpperCase()}) {
            errors = true
            message += " - No contiene una letra mayúscula."
        }
        if (!password.any {it.isLowerCase()}) {
            errors = true
            message += " - No contiene una letra minúscula."
        }
        if (!password.any {it.isDigit()}) {
            errors = true
            message += " - No contiene un número."
        }
        if (password.contains(" ")){
            errors = true
            message += " - No puede contener espacios."
        }

        if (errors){
            println("Contraseña no válida: $message")
        } else {
            println("Contraseña válida.")
        }

        /*2.- Crea un programa donde:
        El usuario introduce temperaturas hasta escribir fin.
        El programa debe mostrar:
            La temperatura máxima.
            La mínima.
            La media.
            Cuántas temperaturas están por encima de la media.
            La diferencia máxima entre dos temperaturas consecutivas.
            Si la temperatura subió, bajó o se mantuvo entre cada medición.*/
        var entry = ""
        var contador: Int = 0
        var lastEntry: Double = 0.0
        var maxVariation: Double = 0.0
        var minEntry: Double = 0.0
        var maxEntry: Double = 0.0
        var actualEntry: Double = 0.0
        var temperatures = mutableListOf<Double>()

        while (entry != "fin"){
            contador++
            println("Ingrese la $contador º temperatura: ")
            entry = readln()
            if (entry.toDoubleOrNull() != null) {
                actualEntry = entry.toDouble()
                temperatures.add(actualEntry)
                if (contador > 1) {
                    var variation = kotlin.math.abs(lastEntry - actualEntry)
                    if (maxVariation < variation) {
                        maxVariation = variation
                    }
                    if (actualEntry < minEntry){
                        minEntry = actualEntry
                    }
                    if (actualEntry > maxEntry){
                        maxEntry = actualEntry
                    }

                    if (lastEntry < actualEntry){
                        println("La temperatura ha subido desde la última medición.")
                    } else if (lastEntry > actualEntry) {
                        println("La temperatura ha bajado desde la última medición.")
                    } else {
                        println("La temperatura se ha mantenido desde la última medición.")
                    }
                } else {
                    maxEntry = actualEntry
                    minEntry = actualEntry
                }
                lastEntry = actualEntry
            } else if (entry != "fin"){
                println("Ingrese una temperatura o 'fin' para finalizar.")
            }
        }

        var total: Double = 0.0
        for (temperature in temperatures){
            total += temperature
        }
        var avg: Double = total / temperatures.size

        var higher: Int = 0
        for (temperature in temperatures){
            if (temperature > avg) {
                higher++
            }
        }

        println("Máxima: $maxEntry")
        println("Mínima: $minEntry")
        println("Media: $avg")
        println("Por encima de la media: $higher")
        println("Mayor variación consecutiva: $maxVariation")

        /*3.- Crea una variable llamada correo que pueda contener un String o null.
        Usa ?.let para mostrar el siguiente mensaje únicamente cuando el correo
        no sea null: “Enviando mensaje a alumno@correo.com”. Si el correo es nulo
        imprime: “No se ha indicado ningún correo”*/
        var correo: String?= null

        correo?.let {
            println("Enviando mensaje a $correo.")
        } ?: println("No se ha indicado ningún correo")



    }
}*/