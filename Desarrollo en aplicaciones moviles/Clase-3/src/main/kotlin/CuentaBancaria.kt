package org.example
// open = permite que otras clases puedan heredar
open class CuentaBancaria (val numeroCuenta: Int, val cliente: Cliente, saldoInicial: Double ){


    private var saldo: Double = saldoInicial

    fun obtenerSaldo():Double {

        return saldo

    }

    fun depositar(monto: Double) {

        if (monto <= 0) {

            throw IllegalArgumentException("El deposito debe ser mayor a 0")

        } else {


            saldo += monto
            println("Deposito realizado con exito")

        }



    }


    fun retirar(monto: Double) {

        if (monto > saldo) {

            throw SaldoInsuficienteException("Saldo insuficiente")

        } else {

            saldo -= monto
            println("Retiro realizado con exito")
        }

    }


    open fun mostrarTipoCuenta() {

        println("Cuenta Bancaria")

    }

    fun mostrarResumen() {

        println("-------------Cuenta----------")
        println("Numero: $numeroCuenta")
        println("Cliente: ${cliente.nombre}")
        println("Saldo: $saldo")

    }

}