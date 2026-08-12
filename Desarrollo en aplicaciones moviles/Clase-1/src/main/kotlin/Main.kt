package org.example


fun main() {

    val nombreProducto: String = "Teclado"
    val cantidad: Int = 2
    val precio: Double = 29990.0
    val disponible: Boolean = true
    val categoria: Char = 'T'

    var total : Double = precio*cantidad

    println("=======================")
    println("      PRODUCTO")
    println("=======================")

    println("Producto: $nombreProducto")
    println("Precio: $precio")
    println("Cantidad: $cantidad")
    println("Disponible: $disponible")
    println("Categoria: $categoria")
    println("Total: $total")

}


