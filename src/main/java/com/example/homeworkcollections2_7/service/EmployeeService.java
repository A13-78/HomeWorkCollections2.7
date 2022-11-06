package com.example.homeworkcollections2_7.service;

import com.example.homeworkcollections2_7.model.Employee;

import java.util.Collection;

public interface EmployeeService {
     Collection<Employee> printAll();
    public Employee remove(String firstName, String lastName);
    public Employee search(String firstName, String lastName);
    public Employee add(String firstName, String lastName);

}
