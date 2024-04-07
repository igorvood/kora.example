package ru.vood.kora.database

import ru.tinkoff.kora.database.common.annotation.Column
import ru.tinkoff.kora.database.common.annotation.Repository
import ru.tinkoff.kora.database.jdbc.JdbcRepository
import ru.tinkoff.kora.http.common.annotation.Query


//data class Entity(
//    val id: Long,
//    @field:Column("value1")
//    val field1: String,
//    val value2: String,
//)
//
//@Repository
//interface EntityRepository : JdbcRepository {
//
//    @Query("SELECT id, value1, value2 FROM test_table WHERE id = :id")
//    fun getOneById(id: Long?): Entity?
//}