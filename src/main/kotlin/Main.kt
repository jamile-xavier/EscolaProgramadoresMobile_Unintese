/*fun main () {
    println("Bruno para o Aladin")
    print("Gosto mais de Python do que de Kotlin")
}

fun main () {
    val caixa = readLine()
    print(caixa) // String
}

fun main () {
    val nome = "Brunno" // String
    var idade = 30 // Inteiro (int)
    println(nome)
    println(idade)

    // val é uma constante e var para variáveis
}

fun main () {
    val nome: String = "Jamile"// String
    var idade: Int = 33  // Inteiro (int)
    var nota: Double = 7.5  //Double (16 casas decimais)
    var altura: Float = 1.65f  //Float (7 casas decimais)
    val aprovado: Boolean = true //Boolean
    val inicial: Char = 'F'   //Char
    println("Nome: $nome")
    println("Idade: $idade")
    println("Nota: $nota")
    println("Altura: $altura m")
    println("Aprovado: $aprovado")
    println("Inicial: $inicial")
}*/

import funcoes.calcularMedia
import funcoes.dadosPessoais
import funcoes.espera
import funcoes.mediaDoAluno
import funcoes.verificarAprovação


fun main() {
    menu ()
}

fun menu(){

    println("Menu")
    println("1 - Chamar função dadosPessoais()")
    println("2 - Chamar função verificarAprovação()")
    println("3 - Chamar função mediaDoAluno()")
    println("4 - Encerrar programa")
    var escolha = readln()

    if (escolha == "1"){
        dadosPessoais()
        espera()
        menu()
    }
    else if (escolha == "2"){
        val n1Aluno1= 10.0
        val n2Aluno1= 10.0
        val n3Aluno1= 10.0
        val n4Aluno1= 10.0
        val media = calcularMedia(nota1 = n1Aluno1, nota2 = n2Aluno1, nota3 = n3Aluno1, nota4 = n4Aluno1)
        verificarAprovação(media)
        espera()
        menu()
    }
    else if (escolha == "3") {
        mediaDoAluno()
        espera()
        menu()
    }
    else if (escolha == "4") {
        println("Encerrando o programa")
        espera()
    }
    else {
        println("Opção inválida")
        espera()
        menu()
    }

}

// 4 -> O programa vai encerrar
// Colocar qualquer otra coisa  -> Volta para o menu

/*fun mediaDoAluno() {
//    calcularMedia(nota1 = 10.0, nota2 = 5.0, nota3 = 8.6, nota4 = 4.8)
    val n1Aluno1 = 10.0
    val n2Aluno1 = 10.0
    val n3Aluno1 = 10.0
    val n4Aluno1 = 10.0
    calcularMedia(nota1 = n1Aluno1, nota2 = n2Aluno1, nota3 = n3Aluno1, nota4 = n4Aluno1)

    /*val n1Aluno2= 3.0
val n2Aluno2= 7.0
val n3Aluno2= 5.0
val n4Aluno2= 2.0
calcularMedia(nota1 = n1Aluno2, nota2 = n2Aluno2, nota3 = n3Aluno2, nota4 = n4Aluno2)

// !! significa dizer que o número nunca vai ser um nulo
val n1Aluno3= readLine()!!.toDouble()
val n2Aluno3= readLine()!!.toDouble()
val n3Aluno3= readLine()!!.toDouble()
val n4Aluno3= readLine()!!.toDouble()
calcularMedia(nota1 = n1Aluno3, nota2 = n2Aluno3, nota3 = n3Aluno3, nota4 = n4Aluno3)}
}*/