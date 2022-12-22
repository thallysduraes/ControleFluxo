/* Link dos exercícios:
https://github.com/DevMasterTeam/Udemy-Andorid-Kotlin/blob/master/Secao%2007%20-%20Controle%20de%20fluxo/Reforce%20seu%20aprendizado%20-%20For%20While.pdf
*/

fun main() {
    ex8(5)
}

//Exercícios fluxo - For
fun ex4() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun ex5() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun ex6() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun ex7() {
    var sum = 0
    for (i in 1..500) {
        sum += i;
    }
    print(sum);
}

fun ex8(n: Int) {
    print("Digite um valor: ")
    var qtd = 0;

    for (i in 1..n) {
        qtd = i;
        for (j in i..qtd){
            print("#")
        }
    }
}


