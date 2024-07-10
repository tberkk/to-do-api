package com.example.todo.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TodoDto {
    private Integer id;
    private String title;
    private String message;
    private Boolean isDone;
    private Timestamp createdAt;
}
