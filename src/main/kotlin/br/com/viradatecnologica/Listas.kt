fun main(args: Array<String>) {

    val frutas = mutableListOf("amora","banana","cacau","damasco")

    println(frutas)

    println("3º ${frutas[2]}")

    println("1º ${frutas.first()}")

    println("Último: ${frutas.last()}")

    frutas+="tomate"
    println(frutas)

    frutas-="tomate"
    println(frutas)

    frutas+=mutableListOf("morango", "abacaxi")
    println(frutas)

    frutas.forEach {
        println(it)
    }

    frutas.forEachIndexed { i, fruta ->
        println("${i+1}ª fruta: $fruta")
    }

    val frutasComC = frutas.filter { it.contains("c") }
    println("Com 'c': $frutasComC")

    frutas.removeIf { it.contains("c") }
    println("Sem 'c': $frutas")


    val palavras = mutableListOf("bb", "aaaa", "d", "ccc")

    palavras.sortBy{ p -> p.length }
    println(palavras)

    palavras.sortByDescending{ p -> p.length }
    println(palavras)
}
