package com.example.todo.mapper;

import com.example.todo.dto.TodoDto;
import com.example.todo.model.Todo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoDto toDto(Todo todo);
    Todo toEntity(TodoDto todoDto);
    List<TodoDto> toDtoList(List<Todo> todos);
    List<Todo> toEntityList(List<TodoDto> dtos);
}
