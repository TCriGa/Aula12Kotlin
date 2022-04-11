/*Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis.
Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca
*/

fun main() {
    println("Informe o valor de X")
    var x = readln().toInt()

    println("Informe o valor de Y")
    var y = readln().toInt()
var troca : Int

    if (x != y){
        troca = x
        x = y
        y = troca
    }
    println("O valor de X e Y é $x e $y")


}
