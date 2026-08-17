package org.example

class CuentaCorriente(numeroCuenta: Int, cliente: Cliente, saldoInicial : Double, val limiteDeTransferencia: Double): CuentaBancaria(numeroCuenta, cliente, saldoInicial) {

    override fun mostrarTipoCuenta() {

        println("Cuenta Corriente")
        println("Limite de transferencia: $limiteDeTransferencia")

    }



}