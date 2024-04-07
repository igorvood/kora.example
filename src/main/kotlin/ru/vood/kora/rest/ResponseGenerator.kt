package ru.vood.kora.rest

import ru.tinkoff.kora.common.Component
import ru.vood.kora.config.FooServiceConfig

@Component
class ResponseGenerator(
//    private val FooServiceConfig: FooServiceConfig
) {

    fun generate(): String = "Hello world"
}