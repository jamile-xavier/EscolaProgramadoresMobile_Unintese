package com.todolistapp.app // Declaração do pacote
import com.todolistapp.service.ListaDeTarefas // Importa a classe ListaDeTarefas
import com.todolistapp.model.Tarefa // Também é bom importar Tarefa, caso você queira manipulá-la diretamente no main

// 3. Função Principal (main): Onde o programa é executado e interage com o usuário.
fun main() {
    val listaDeTarefas = ListaDeTarefas()
    var sair = false

    while (!sair) {
        println("\n--- MENU DA LISTA DE TAREFAS ---")
        println("1. Adicionar Tarefa")
        println("2. Remover Tarefa")
        println("3. Marcar Tarefa como Completa")
        println("4. Desmarcar Tarefa como Completa")
        println("5. Exibir Todas as Tarefas")
        println("6. Exibir Tarefas Pendentes")
        println("7. Exibir Tarefas Completas-")
        println("8. Sair")
        print("Escolha uma opção: ")

        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Digite a descrição da tarefa: ")
                val descricao = readLine() ?: ""
                print("Deseja adicionar uma data de vencimento? (formato livre, deixe em branco para não adicionar): ")
                val dataVencimento = readLine()?.takeIf { it.isNotBlank() }
                listaDeTarefas.adicionarTarefa(descricao, dataVencimento)
            }
            2 -> {
                print("Digite o ID da tarefa a ser removida: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    listaDeTarefas.removerTarefa(id)
                } else {
                    println("ID inválido.")
                }
            }
            3 -> {
                print("Digite o ID da tarefa a ser marcada como completa: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    listaDeTarefas.marcarTarefa(id)
                } else {
                    println("ID inválido.")
                }
            }
            4 -> {
                print("Digite o ID da tarefa a ser desmarcada como completa: ")
                val id = readLine()?.toIntOrNull()
                if (id != null) {
                    listaDeTarefas.desmarcarTarefa(id)
                } else {
                    println("ID inválido.")
                }
            }
            5 -> listaDeTarefas.exibirTodasAsTarefas()
            6 -> listaDeTarefas.exibirTarefasPendentes()
            7 -> listaDeTarefas.exibirTarefasCompletas()
            8 -> {
                sair = true
                println("Saindo do programa. Até mais!")
            }
            else -> println("Opção inválida. Por favor, tente novamente.")
        }
    }
}