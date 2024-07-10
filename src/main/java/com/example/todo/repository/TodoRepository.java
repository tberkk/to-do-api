package com.example.todo.repository;

import com.example.todo.model.Todo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findAllByOrderByCreatedAtAsc();

    @Modifying
    @Transactional
    @Query("UPDATE Todo t SET t.isDone = NOT t.isDone WHERE t.id = :id")
    void updateIsDone(@Param("id") Integer id);

    void deleteById(Integer id);
}
