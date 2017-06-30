
fun main(args: Array<String>) {

    val palavra: String? = null
    println("Nome caixa alta: ${palavra?.toUpperCase()}")

    for (i in 1..10) {
        println("i: $i")
    }

    fun String.giria(): String {
        return "C é loko, $this?!"
    }
    println("Marcio".giria())

}
