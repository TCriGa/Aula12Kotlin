/*Crie um algoritmo que lê um valor real em dólar, e converte o valor
para reais. Considere a cotação do dolar atual*/

fun main() {
    println("Informe o valor em real R$ que desja converter para Dólar:")
    val real = readln().toDouble()
    conversao(real)

}

fun conversao(dolar: Double){
    val dolar = (dolar * 4.69)
    println("O valor em dólar é $dolar")
}