package com.example.backend.controllers;

import com.example.backend.entities.Backend;
import com.example.backend.repositories.BackendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class BackendController {

    @Autowired
    private BackendRepository backendRepository;

    @GetMapping("/hello")
    public String Hello(){
        return "It works";
    }

    @GetMapping("/projects")
    public Iterable<Backend> getAllProjects() {
        return backendRepository.findAll();
    }

    @PostMapping(value="/add", produces = "application/json")
    public String add(@RequestBody Backend backend) {
        backendRepository.save(backend);
        return "Project was added";
    }
}
