package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class EmployeeController 
{
    @GetMapping(path="/", produces = "application/json")
    public String getEmployees() 
    {
        return "Olá mundo";
    }
}
