package br.com.viradatecnologica

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

    var pessoaClone = pessoa.copy()
    println("clone: $pessoaClone")

    // se estiver com folga de tempo
    var pessoaQuaseClone = pessoa.copy(id=777)
    println("clone: $pessoaQuaseClone")

}