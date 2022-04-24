package com.proyecto.Message;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends JpaRepository<Message, Integer> {
 
    
        @Query("SELECT u FROM messages u WHERE u.nombre = :message")
    public Message findByName(@Param("message") String message);
}
