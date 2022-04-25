package com.proyecto.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {

    @Query("SELECT u FROM Message u WHERE u.nombre = :consulta")
    public Message findByName(@Param("consulta") String consulta);

    @Query("SELECT u FROM Message u WHERE u.idconsultas = :id")
    public Message findById1(@Param("id") Integer id);
}
