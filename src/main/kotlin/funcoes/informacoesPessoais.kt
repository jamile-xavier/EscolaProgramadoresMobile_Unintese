package funcoes

fun dadosPessoais() {
    print("diga seu nome: ")
    val nome: String? = readln()
    print("diga sua idade: ")
    val idade: Int? =  readln().toIntOrNull()
    print("diga sua nota: ")
    val listaDeNotas: MutableList<Double> = mutableListOf(1.5, 2.8, 3.9, 4.9)
    print("diga sua altura: ")
    val altura: Float? = readln().toFloatOrNull()


    println("Nome: $nome")
    println("Idade: $idade")
    println("Nota: $listaDeNotas")
    println("Altura: $altura m")
}

fun mediaDoAluno(){
//    println("Essas são as notas do aluno")
    val listaDeNotas: MutableList<Double> = mutableListOf(5.0,5.0,5.0,5.0)

    var soma = 0.0
//
//    for (nota in 1..3) {
//        var valor = readln().toDouble()
//        listaDeNotas.add(valor)
//    }

    for(nota in listaDeNotas){
    //    println("nota: $nota ")
        soma = soma + nota
 //      println("Soma atual: $soma \n")
    }

   val media = soma / listaDeNotas.size

//    println("Media final: ${media}")

//    if (media >= 6){
//        println("Aprovado")
//    } else if (media >=3 && media <= 5.9) {
//        println("Aluno de Recuperação")
//    }
//    else {
//        println("Reprovado")
//    }

 //Tudo com a mesma variável o when deixa o código mais enxuto
//    when(media){
//        in 6.0 .. 10.0 -> println("Aprovado")
//        in 3.0 .. 5.9 -> println("Recuperação")
//        else -> println("Reprovado")
//           }

    print("Fim do programa")
}

fun calcularMedia(nota1 : Double, nota2 : Double, nota3 : Double, nota4 : Double): Double {
   val soma = nota1 + nota2 + nota3 + nota4
    val media = soma / 4
    return (media)
//    when(media){
//        in 6.0 .. 10.0 -> println("Aprovado")
//        in 3.0 .. 5.9 -> println("Recuperação")
//        else -> println("Reprovado")
//    }
}

fun verificarAprovação(validacao: Double){
    when(validacao) {
        in 6.0 .. 10.0 -> println("O aluno está aprovado")
        in 3.0 .. 5.9 -> println("O aluno etsá de recuperação")
        else -> println("O aluno está reprovado")
    }
}

fun espera() {
    println("Aperte qualquer tecla para continuar com a solicitação")
    readln()
}