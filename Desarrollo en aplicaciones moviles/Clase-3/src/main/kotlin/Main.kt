package org.example



fun main() {

    println("Crear Clientes")

    val cliente = Cliente("Camilo Soto", "22123123-1")
    cliente.mostrarInformacion()

    println("Crear cuentas")

    val cuentaAhorro = CuentaAhorro(1001, cliente, 0.0, 3.9)

    val cuentaCorriente = CuentaCorriente(2001, cliente, 0.0, 500.0)

    cuentaAhorro.mostrarResumen()

    cuentaCorriente.mostrarResumen()


    println("Polimorfismo")

    val cuentas: List<CuentaBancaria> = listOf(cuentaCorriente, cuentaAhorro)

    for (cuenta in cuentas) {

        cuenta.mostrarTipoCuenta()

    }


    print("Try catch Finally")

    try {

        cuentaAhorro.retirar(500.0)
        println("Operacion de retiro realizada")
    } catch (error: SaldoInsuficienteException) {

        println("Error ${error.message}")


    } finally{

        println("operacion bancaria finalizado")

    }


    println("Programa no se detiene")


    println("Tipos de excepciones")


    try {

        cuentaAhorro.depositar(-200.0)

    } catch (error: IllegalArgumentException) {

        println("Error: ${error.message}")


    } finally {

        println("Prueba finalizada")


    }


    //exception aritmetica
    try {
        val numeroA= 10
        val numeroB = 0
        val resultado = numeroA/numeroB
        println(resultado)
    }catch (error: ArithmeticException){
        println("Error: matematico")
    }finally {
        println("Finalizando prueba matematica")
    }

    //tipo de formato

    try {
        val texto = "ABC"
        val numero = texto.toInt()
        println(numero)
    }catch (error: NumberFormatException){
        println("Error: de formato texto debe ser un numero")
    }finally {
        println("conversion finalizanda")
    }

    //index out bounds
    try {
        val nombres = listOf(
            "ana",
            "pedro",
            "maria"
        )
        println(nombres[5])
    }catch (error: IndexOutOfBoundsException){
        println("Error: posicion inexistente")
    }finally {
        println("consulta finalizada")
    }

    //Null pointer exception
    try {
        val nombre: String? = null
        println(nombre!!.length)

    }catch (error: NullPointerException){
        println("error: el valor es nulo")
    }finally {
        println("conversion finalizanda")
    }

    //custom exception
    try {
        cuentaAhorro.retirar(99999999.0)
    }catch (error: SaldoInsuficienteException){
        println("Banco informa: ${error.message}")
    }finally {
        println("intento de retiro finalizado")

    }
    //retiro interactivo
    try {
        println("Ingrese el monto a retirar")
        val entrada = readln()
        val monto = entrada.toDouble()
        cuentaAhorro.retirar(monto)
        println("saldo restante: $ ${cuentaAhorro.obtenerSaldo()}")
    }catch (error: NumberFormatException){
        println("Error tipo de dato no valido")

    }catch(error: IllegalArgumentException){
        println("Error monto incorrecto")
    }catch(error: SaldoInsuficienteException){
        println("Error: ${error.message}")
    }finally {
        println("consulta finalizada gracias")
    }
    println("terminado")




}