package br.com.viradatecnologica

fun main(args: Array<String>) {
    var paisLoko = Pais()
    paisLoko.id=1
    paisLoko.nome="Pais da Gaga"
    paisLoko.pib=60000.0

    println(paisLoko)
    println(paisLoko.id)
}