package org.example


data class Estudiante(


    val nombre: String,
    val alias: String?,
    val pundaje: Int,
    val estado: Boolean

)

fun main() {

    val edad = 20

    val estado = if (edad >= 18) "Adulto" else "Menor"

    println(edad)

    println("estado: $estado")

    val puntaje = 85

    val nivel = when {

        puntaje >= 90 -> "Experto"
        puntaje >= 70 -> "Intermedio"
        puntaje >= 50 -> "Principiante"
        else -> "Basura"
    }

    println(nivel)

    val opcion = 2

    val lenguaje = when (opcion) {

        1 -> "Java"
        2 -> "Python"
        3 -> "Godot Script"
        else -> "Lenguaje desconocido"

    }

    println(lenguaje)

    var apodo: String? = null

     println("apodo: $apodo")

    apodo = "Don pancho"


    println("apodo: $apodo")

    var usuario: String? = null
    println("Cantidad de letras: ${usuario?.length}")
    usuario = "Anibal"
    println("Cantidad de letras: ${usuario?.length}")


    var nickName: String? = null

    val nombreVisible = nickName ?: "Usuario sin nombre"




}