/*Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu*/

fun main() {
    println("Infome sua idade: ")
    val idade = readln().toInt();

    val diasIdade = (idade * 365)

    println("Você viveu $diasIdade dias")
}