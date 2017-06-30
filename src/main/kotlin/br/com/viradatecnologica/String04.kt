package br.com.viradatecnologica

/**
 * Created by aluno on 27/06/2017.
 */
fun main(args: Array<String>) {
    val n1 = "10"
    println("Resultado: ${n1.toInt()+5}")

    val n2 = "10.5"
    println("Resultado 2: ${n2.toDouble()*2}")

    val palavra = "amor"
    println(palavra.repeat(3))

    val rg = "123"
    println(rg.padStart(6, '0'))

    println(palavra[2])

}