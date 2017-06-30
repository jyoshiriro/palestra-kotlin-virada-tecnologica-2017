fun main(args: Array<String>) {

    val estados = mutableMapOf("SP" to "São Paulo", "MG" to "Minas Gerais", "PA" to "Pará")
    println(estados)

    println("MG: ${estados["MG"]}")

    estados["RS"]="Rio Grande do Sul"
    println(estados)

    estados-="RS"
    println(estados)

    estados.forEach {
        println("${it.key} - ${it.value}")
    }

    val mapaLoko = mutableMapOf(1 to "abelha")
    // m2.get já indica os tipos de chave e o valor
    // ex: m2.get("oi") erro de compilação!

}
