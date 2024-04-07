package ru.vood.kora.database

import ru.tinkoff.kora.database.common.annotation.Query
import ru.tinkoff.kora.database.common.annotation.Repository
import ru.tinkoff.kora.database.jdbc.JdbcRepository

@Repository
interface EntityRepository : JdbcRepository {
    @Query("SELECT id, value1, value2 FROM test_table WHERE id = :id")
    fun getOneById(id: Long): Entity
}