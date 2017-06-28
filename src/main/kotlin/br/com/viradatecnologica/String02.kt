package br.com.viradatecnologica

/**
 * Created by aluno on 27/06/2017.
 */
fun main(args: Array<String>) {
    val meuSql = """
Select * from cliente
where idade >= 18
order by idade
"""
    println(meuSql)
}