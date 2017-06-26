import br.com.viradatecnologica.Pais

/**
 * Created by jyoshiriro on 6/10/17.
 */
fun main(args: Array<String>) {

    val estados = mutableMapOf("SP" to "São Paulo", "MG" to "Minas Gerais", "PA" to "Pará")
    println(estados)

    println("MG: ${estados["MG"]}")

    estados["RS"]="Rio Grande do Sul"
    println(estados)

    estados-="RS"
    println(estados)

    estados.forEach { chave, valor ->
        println("Chave: $chave, de valor $valor")
    }

    val m2 = mutableMapOf(1 to 3.5)
    // m2.get já indica os tipos de chave e o valor
    // ex: m2.get("oi") erro de compilação!

}
