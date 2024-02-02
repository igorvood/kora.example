package ru.vood.kora

import ru.tinkoff.kora.common.KoraApp
import ru.tinkoff.kora.config.common.ConfigModule
import ru.tinkoff.kora.http.server.undertow.UndertowHttpServerModule
import ru.tinkoff.kora.micrometer.module.MetricsModule


@KoraApp
interface Application : ConfigModule, MetricsModule, UndertowHttpServerModule