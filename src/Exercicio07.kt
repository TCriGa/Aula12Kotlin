/*Escreva um algoritmo para ler as dimensões de um retângulo (base
e altura), calcular e escrever a área do retângulo
*/

fun main() {
    println("Informe o valor da base do retangulo")
    val b = readln().toDouble()
    println("Informe o valor da altura do retangulo:")
    val h = readln().toDouble()

    println("O valor da área do retangulo é ${areaRetangulo(b, h)}")
}
fun areaRetangulo ( base: Double, altura: Double) = (base * altura)
