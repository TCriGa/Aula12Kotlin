/*Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5
* */

fun main() {
    println("Digite um número")
    val n = readln().toInt()

    if (n % 5 == 0) {
        println("É multiplo de 5")
    } else {
        println("Não é multiplo de 5")
    }
}