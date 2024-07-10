package com.example.todo.service;

import com.example.todo.dto.TodoDto;
import com.example.todo.mapper.TodoMapper;
import com.example.todo.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;
    private final TodoMapper todoMapper;

    public List<TodoDto> getAll() {
        return todoMapper.map(todoRepository.findAllByOrderByCreatedAtAsc());
    }
}
