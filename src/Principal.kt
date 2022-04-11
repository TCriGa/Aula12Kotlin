@file:Suppress("CONFUSING_BRANCH_CONDITION_WARNING")

import kotlin.system.exitProcess

fun main() {

    println("Digite uma opção")
    val opcao = readln().toInt()

    when(opcao){
        1 -> println("Cadastro de usuário")
        2 -> println("Calcula imposto")
        3 -> exitProcess(0) // Para encerrar o processo, sair.

        else->{
            println("Opção Invalida")
        }

    }
}