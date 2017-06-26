/**
 * Created by jyoshiriro on 6/10/17.
 */
fun main(args: Array<String>) {

    val textoTeste = null
    println(textoTeste ?: "nada :(")

    val palavra: String? = null
    println("Nome caixa alta: ${palavra?.toUpperCase()}")

    for (i in 1..10) {
        println("i: $i")
    }

    for (i in (1..10 step 2)) {
        println("impar: $i")
    }

}