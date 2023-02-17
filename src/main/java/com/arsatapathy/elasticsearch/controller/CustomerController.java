package com.arsatapathy.elasticsearch.controller;

import com.arsatapathy.elasticsearch.model.Employee;
import com.arsatapathy.elasticsearch.model.Student;
import com.arsatapathy.elasticsearch.service.EmployeeService;
import com.arsatapathy.elasticsearch.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    public final StudentService studentService;
    public final EmployeeService employeeService;

    @Autowired
    public CustomerController(StudentService service, EmployeeService employeeService) {
        this.studentService = service;
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public ResponseEntity<String> home() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }
}
