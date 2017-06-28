package br.com.viradatecnologica

import javax.swing.JOptionPane

/**
 * Created by aluno on 27/06/2017.
 */
fun main(args: Array<String>) {
    val palavra1 = JOptionPane.showInputDialog("Digite uma palavra")
    val palavra2 = JOptionPane.showInputDialog("Digite outra palavra")

    if (palavra1 == palavra2){
        println("São iguais")
    }
    else{
        println("São diferentes")
    }

    println("São iguais").takeIf { palavra1 == palavra2 }

}