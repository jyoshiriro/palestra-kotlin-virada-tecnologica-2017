package br.com.viradatecnologica

/**
 * Created by jyoshiriro on 6/11/17.
 */
fun main(args: Array<String>) {
    var paisLoko = Pais()
    paisLoko.id=1
    paisLoko.nome="Pais da Gaga"
    paisLoko.pib=60000.0

    println(paisLoko)
    println(paisLoko.id)

    var paisIncompleto = Pais()
    println("caixa alta do incompleto: ${paisIncompleto.nome?.toUpperCase()}")

}