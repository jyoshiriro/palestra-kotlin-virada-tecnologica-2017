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

    println("Último: ${frutas.last()}") // falar do first

    frutas.forEach {
        println(it)
    }
    frutas.forEach { fruta ->
        println(fruta)
    }

    frutas.forEachIndexed { i, fruta ->
        println("$i - $fruta")
    }

    val frutasComC = frutas.filter { it.contains("c") }
    println("Com 'c': $frutasComC")

    // caso perguntem:
    val vet:Array<String> = arrayOf("", "")
    var vet2:Array<Int> = arrayOf(3, 2, 2)

    frutas.removeIf { it.contains("c") }
    println("Sem 'c': $frutas")

    val palavras = mutableListOf("bb", "aaaa", "d", "cc2", "cc0", "cc1")

    palavras.sortBy{ it.length }
    println(palavras)

    palavras.sortByDescending{ it.length }
    println(palavras)

    palavras.sortWith(compareBy({ it.length }, { it }))
    println(palavras)

    // lembrar do nome de variável ao invés do "it"
}
