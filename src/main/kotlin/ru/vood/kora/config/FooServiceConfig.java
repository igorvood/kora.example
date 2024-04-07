package ru.vood.kora.config;

import ru.tinkoff.kora.config.common.ConfigSource;

@ConfigSource("services.foo")
public record FooServiceConfig(String bar, int baz) {}
