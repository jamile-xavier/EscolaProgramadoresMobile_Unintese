package com.todolistapp.model // Declaração do pacote

// 1. Classe Tarefa: Representa uma única tarefa.
class Tarefa(
    val id: Int,
    var descricao: String,
    var dataVencimento: String? = null,
    var completa: Boolean = false
) {
    fun marcarComoCompleta() {
        completa = true
        println("Tarefa '$descricao' marcada como completa.")
    }

    fun desmarcarComoCompleta() {
        completa = false
        println("Tarefa '$descricao' desmarcada como completa.")
    }

    fun exibirDetalhes() {
        val status = if (completa) "[COMPLETA]" else "[PENDENTE]"
        val vencimento = dataVencimento?.let { " (Vencimento: $it)" } ?: ""
        println("ID: $id | Descrição: $descricao $vencimento $status")
    }
}