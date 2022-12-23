/* Link dos exercícios:
https://github.com/DevMasterTeam/Udemy-Andorid-Kotlin/blob/master/Secao%2007%20-%20Controle%20de%20fluxo/Reforce%20seu%20aprendizado%20-%20For%20While.pdf
*/

fun main() {
    desafio()
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
        for (j in i..qtd) {
            print("#")
        }
    }
}

//Exercícios fluxo - While

fun ex9() {
    val caixa = 2000
    val capacidade = 7
    var numBaloes = 0

    while (numBaloes * capacidade + capacidade < caixa) {
        numBaloes++
    }
    println(numBaloes)
}

fun ex10() {
    var i = 1
    while (i <= 50) {
        if (1 % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun ex11(str: String) {
    var i = str.length - 1
    while (i >= 0){
        print(str[i])
        i--
    }
}

fun desafio(){
    val salario = 10000f
    var ana = 0f
    var paula = 0f
    var mes = 0

    do{
        ana += (salario * 0.05f) + (salario * 0.05f) + (ana * 0.002f);
        paula += (salario * 0.05f) + (paula * 0.008f);
        mes++;
        println("Patrimônio Ana: R$$ana -" +
                " Patrimônio Paula: R$$paula");
    }while (ana > paula)
    println("Ana - R$${(ana * 0.002f)}")
    println("Paula - R$${(paula * 0.008f)}")
    println("Paula irá ter o patrimônio de Ana no mês $mes")
}