package br.com.viradatecnologica

/**
 * Created by aluno on 27/06/2017.
 */
fun main(args: Array<String>) {
    val animais = listOf("cavalo", "zebra", "papagaio")
    val frutas = mutableListOf("maçã", "laranja", "mamão")

    println("3ª fruta: ${frutas[2]}")

    frutas+="tomate"
    println(frutas)

    frutas-="maçã"
    println(frutas)

    frutas+= mutableListOf("banana", "pêra")
    println(frutas)

    println("1º: ${frutas.first()}")
    println("Último: ${frutas.last()}")

    frutas.forEach{
        println(it)
    }

    frutas.forEachIndexed{ i, fruta ->
        println("$i - $fruta")
    }

    val frutasComM = frutas.filter {it.contains("m")}
    println("Com m: $frutasComM")

    frutas.removeIf{ it.contains("m")}
    println("Sem m: $frutas")

    frutas.sortedBy { it.length }
    println(frutas)

    frutas.sortByDescending { it.length }
    println(frutas)

    frutas+= mutableListOf("maçã", "jaca")

    frutas.sortWith(compareBy({it.length}, {it}))
    println(frutas)
}