package com.tinkeringwithcode.TODO.controller;

import com.tinkeringwithcode.TODO.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private static TodoService todoService;

    @PostMapping()
    public String addTodos(int amountOfData)
    {
        todoService.generateTodos(amountOfData);
        return "Generated "+amountOfData;
    }

    @GetMapping()
    public void getTodo()
    {

    }
}
