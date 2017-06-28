
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

    fun String.giria(): String {
        return "C é loko, $this?!"
    }

    fun Int.loko(param:Int): Int {
        return this+(param*2)
    }

    println("Marcio".giria())

}