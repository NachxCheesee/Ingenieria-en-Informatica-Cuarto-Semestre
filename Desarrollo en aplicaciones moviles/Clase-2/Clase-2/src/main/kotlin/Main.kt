package org.example


fun main() {


    println("hola mundo")



    fun mayorDeEdad(edad: Int):Boolean {

        return edad >= 18

    }

    fun doble(numero: Int) = numero * 2


    for (i in 1 .. 10) {

        println("intento: $i")

    }


    val edades = listOf(18, 20 , 17, 22, 20, 31)

    println(edades)

    var i = 0

    while(i < edades.size) {

        println("Posicion: $i ${edades[i]}")

        i = i + 1

    }

    edades.forEach { edad -> println("edad: $edad") }


    val nombres = listOf("brayan", "vicent", "hithit",  "hithit")

    println(nombres)

    val nombresUnicos = nombres.toSet()

    println("nombres unicos: $nombresUnicos")


    val cursos  = mapOf(

        "Ana" to "Aplicaciones moviles",
        "Benja" to "Full Stack 2"

    )

    println(cursos)

    val primerMayor18 = edades.find{edad -> edad>= 18}

    println(primerMayor18)

    val adultos = edades.filter {edad -> edad >= 18}

    println(adultos)








}