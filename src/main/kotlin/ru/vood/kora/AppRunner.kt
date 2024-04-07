package ru.vood.kora

import ru.tinkoff.kora.application.graph.KoraApplication

object AppRunner {
    @JvmStatic
    fun main(args: Array<String>) {
        KoraApplication.run { ApplicationGraph.graph() }
    }
}