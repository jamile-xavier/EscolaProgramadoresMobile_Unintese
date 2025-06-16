package com.todolistapp.service // Declaração do pacote
import com.todolistapp.model.Tarefa // Importa a classe Tarefa do pacote model

// 2. Classe ListaDeTarefas: Gerencia uma coleção de Tarefas.
class ListaDeTarefas {
    private val tarefas = mutableListOf<Tarefa>()
    private var proximoId = 1

    fun adicionarTarefa(descricao: String, dataVencimento: String? = null) {
        val novaTarefa = Tarefa(proximoId++, descricao, dataVencimento)
        tarefas.add(novaTarefa)
        println("Tarefa '$descricao' adicionada com sucesso! (ID: ${novaTarefa.id})")
    }

    fun removerTarefa(id: Int) {
        val tarefaParaRemover = tarefas.find { it.id == id }
        if (tarefaParaRemover != null) {
            tarefas.remove(tarefaParaRemover)
            println("Tarefa com ID $id ('${tarefaParaRemover.descricao}') removida com sucesso.")
        } else {
            println("Erro: Tarefa com ID $id não encontrada.")
        }
    }

    fun marcarTarefa(id: Int) {
        val tarefa = tarefas.find { it.id == id }
        if (tarefa != null) {
            tarefa.marcarComoCompleta()
        } else {
            println("Erro: Tarefa com ID $id não encontrada.")
        }
    }

    fun desmarcarTarefa(id: Int) {
        val tarefa = tarefas.find { it.id == id }
        if (tarefa != null) {
            tarefa.desmarcarComoCompleta()
        } else {
            println("Erro: Tarefa com ID $id não encontrada.")
        }
    }

    fun exibirTodasAsTarefas() {
        if (tarefas.isEmpty()) {
            println("Nenhuma tarefa na lista.")
        } else {
            println("\n--- SUAS TAREFAS ---")
            tarefas.forEach { it.exibirDetalhes() }
            println("--------------------")
        }
    }

    fun exibirTarefasPendentes() {
        val tarefasPendentes = tarefas.filter { !it.completa }
        if (tarefasPendentes.isEmpty()) {
            println("Todas as tarefas estão completas! 🎉")
        } else {
            println("\n--- TAREFAS PENDENTES ---")
            tarefasPendentes.forEach { it.exibirDetalhes() }
            println("-------------------------")
        }
    }

    fun exibirTarefasCompletas() {
        val tarefasCompletas = tarefas.filter { it.completa }
        if (tarefasCompletas.isEmpty()) {
            println("Nenhuma tarefa completa ainda.")
        } else {
            println("\n--- TAREFAS COMPLETAS ---")
            tarefasCompletas.forEach { it.exibirDetalhes() }
            println("-------------------------")
        }
    }

    fun encontrarTarefaPorId(id: Int): Tarefa? {
        return tarefas.find { it.id == id }
    }
}