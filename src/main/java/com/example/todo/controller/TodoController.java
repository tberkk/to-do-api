package com.example.todo.controller;

import com.example.todo.dto.TodoDto;
import com.example.todo.service.TodoService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
@RequestMapping(value = "/todo")
public class TodoController {

    private final TodoService todoService;

    @GetMapping(value = "/getAll")
    public List<TodoDto> getAll() {
        return todoService.getAll();
    }

    @PostMapping(value = "/updateIsDone")
    public void updateIsDone(@RequestParam Integer id) {
        todoService.updateIsDone(id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody TodoDto todoDto) {
        todoService.saveTodo(todoDto);
    }

    @PostMapping(value = "/delete")
    public void delete(@RequestParam Integer id) {
        todoService.delete(id);
    }
}
