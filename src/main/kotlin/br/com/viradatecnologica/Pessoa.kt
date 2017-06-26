import java.util.*

/**
 * Created by jyoshiriro on 6/10/17.
 */
data class Pessoa (
    var id:Int,
    var nome:String
)

fun main(args: Array<String>) {

    var pessoa = Pessoa(1, "Zé Ruela")
    println(pessoa)

    pessoa.id=2
    pessoa.nome="Gaby Amarantos"
    println(pessoa)

    pessoa = Pessoa(nome = "Zé Buduia", id=3)
    println(pessoa)

    var pessoaClone = pessoa.copy()
    println("clone: $pessoaClone")

    var pessoaQuaseClone = pessoa.copy(id=777)
    println("clone: $pessoaQuaseClone")
}