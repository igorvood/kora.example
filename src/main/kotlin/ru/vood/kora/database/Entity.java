package ru.vood.kora.database;

import ru.tinkoff.kora.database.common.annotation.Column;

public record Entity(Long id, @Column("value1") String field1, String value2) {}