import javax.swing.JOptionPane

fun main(args: Array<String>) {

    println("oi, fui feito em Kotlin")

    val nome = "Lady Gaga"
    val idade = 35

    println("A maior diva da atualidade é $nome. Hoje ela tem $idade anos.")

    val sqlLoko = """
select * from tb_steira
where id=10
order by data_criacao
"""
    println("E essa instrução, hein? \n $sqlLoko")

    println("Maiusculas: ${nome.toUpperCase()}")

    println("3ª letra: ${nome[2]}")

    println("Dobro de 'letra': ${"8".toInt()*2}")

    println("Triplo de 'letra': ${"3.33".toDouble()*3}")

    println("Letras à esquerda: ${"7".padStart(3,'0')}")

    println("3x é demais! ${nome.repeat(3)}")

    nome.forEach {
        println(it)
    }

    nome.forEachIndexed { index, c ->
        println("${index+1}ª letra: '$c'")
    }

    val t1 = JOptionPane.showInputDialog("Palavra 1")
    val t2 = JOptionPane.showInputDialog("Palavra 2")
    println("é igual? ${t1==t2}")

}