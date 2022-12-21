fun main() {
    ex3();
}

/* Ex1) Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura geométrica.
Informar se formam um quadrado (lados iguais). */

fun ex1(n1: Int, n2: Int) {
    if (n1 == n2) {
        println("É uma quadrado, pois os lados são iguais.");
    } else {
        println("Não é um quadrado, os lados são diferentes.");
    }
}

/* Ex2) Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais). */

fun ex2(n1: Int, n2: Int, n3: Int) {
    if (n1 == n2 && n2 == n3) {
        println("É um triângulo equilátero, pois todos os lados são iguais.")
    } else {
        println("Não é um triângulo equilátero, pois os lados são diferentes")
    }
}

/* Ex3) Escreva um programa para ser usado na portaria de um evento.
        a) Peça a idade. Menores de idade não são permitidos.
        b) Peça o tipo de convite. Os tipos de convite são comum, premium e luxo.
        c) Peça o código do convite. Convites premium e luxo começam com "XL". Convites comuns começam com "XT".
        d) Caso todos os critérios seja satisfeitos, exibir "Welcome". */

fun ex3() {
    print("Forneça a sua idade: ");
    val idade = readln();

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Forneça o tipo de convite: ")
    var convite = readln()
    if (convite != null && convite != "") {
        convite = convite.lowercase()
        if (convite == "comum" || convite == "premium" || convite == "luxo") {
            print("Forneça o código do convite: ")
            var codigo = readln()
            codigo = codigo.lowercase()
                if (convite == "comum" && codigo.startsWith("xt")) {
                println("Welcome.")
                    }else if (convite == "premium" || convite == "luxo" && codigo.startsWith("xl")) {
                        println("Welcome.")
                }else {
                    println("Convite inválido...")
                }
        }else {
            println("Convite inválido...")
            return
        }
    }
}