package com.example.homeworkcollections2_7.controller;

import com.example.homeworkcollections2_7.model.Employee;
import com.example.homeworkcollections2_7.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/employee")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public String welcome() {
        return "<mark><b>Добро пожаловать.</b></mark>";
    }

    @GetMapping("/printAll")
    public Collection<Employee> printAll() {
        return employeeService.printAll();
    }



    @GetMapping("/remove")
    public Employee remove(@RequestParam String firsName,
                          @RequestParam String lastName) {
        return employeeService.remove(firsName, lastName);
    }

    @GetMapping("/search")
    public Employee search(@RequestParam String firstName,
                           @RequestParam String lastName) {
        return employeeService.search(firstName, lastName);
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String firstName,
                       @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);
    }

    
}
