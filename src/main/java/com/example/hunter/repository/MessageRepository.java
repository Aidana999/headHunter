package com.example.hunter.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.hunter.domain.Message;
import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Integer> {
    List<Message> findByTag(String tag);
}
