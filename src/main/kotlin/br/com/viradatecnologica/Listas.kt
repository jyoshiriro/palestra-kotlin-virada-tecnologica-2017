fun main(args: Array<String>) {

    val frutas = mutableListOf("amora","banana","cacau","damasco")

    println(frutas)

    println("3 fruta: ${frutas[2]}")

    frutas+="tomate"
    println(frutas)

    frutas-="tomate"
    println(frutas)

    frutas+=mutableListOf("morango", "abacaxi")
    println(frutas)

    println("1º ${frutas.first()}")

    println("Último: ${frutas.last()}")

    frutas.forEach {
        println(it)
    }

    frutas.forEachIndexed { i, fruta ->
        println("$i - $fruta")
    }

    val frutasComC = frutas.filter { it.contains("c") }
    println("Com 'c': $frutasComC")

    frutas.removeIf { it.contains("c") }
    println("Sem 'c': $frutas")


    val palavras = mutableListOf("bb", "aaaa", "d", "cc2", "cc0", "cc1")

    palavras.sortBy{ p -> p.length }
    println(palavras)

    palavras.sortByDescending{ p -> p.length }
    println(palavras)


    palavras.sortWith(compareBy({ it.length }, { it }))
    println(palavras)
}
