/*Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.
* */

fun main() {
    println("Informe um número")
    val n = readln().toInt()
    positivoNegativo(n)

}

fun positivoNegativo(num: Int) {
    when (num >= 0) {
        true -> println("É positivo")
        else -> println("É negativo")
    }
}