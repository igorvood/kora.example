package ru.vood.kora.database;

import ru.tinkoff.kora.database.common.annotation.Query;
import ru.tinkoff.kora.database.common.annotation.Repository;
import ru.tinkoff.kora.database.jdbc.JdbcRepository;

@Repository
public interface EntityRepository extends JdbcRepository {


    @Query("SELECT id, value1, value2 FROM test_table WHERE id = :id")
    Entity getOneById(Long id);

}
