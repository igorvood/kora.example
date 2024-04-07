package ru.vood.kora.rest

import ru.tinkoff.kora.common.Component
import ru.tinkoff.kora.http.common.HttpHeaders
import ru.tinkoff.kora.http.common.HttpMethod
import ru.tinkoff.kora.http.common.annotation.HttpRoute
import ru.tinkoff.kora.http.server.common.HttpServerResponse
import ru.tinkoff.kora.http.server.common.SimpleHttpServerResponse
import ru.tinkoff.kora.http.server.common.annotation.HttpController
import java.nio.charset.StandardCharsets


@Component
@HttpController
class HelloWorldController {
    @HttpRoute(method = HttpMethod.GET, path = "/hello/world")
    fun helloWorld(): HttpServerResponse {
        return SimpleHttpServerResponse(
            200,
            "text/plain",
            HttpHeaders.of(),
            StandardCharsets.UTF_8.encode("Hello world")
        )
    }
}