package org.example

class CuentaAhorro (numeroCuenta: Int, cliente: Cliente, saldoInicial: Double, val tasaInteres:Double): CuentaBancaria(numeroCuenta, cliente, saldoInicial) {


    override fun mostrarTipoCuenta() {

        println("Cuenta Ahorro")
        println("Tasa de interes: $tasaInteres")

    }


}