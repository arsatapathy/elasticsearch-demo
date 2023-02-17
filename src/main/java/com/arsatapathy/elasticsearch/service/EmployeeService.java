package com.arsatapathy.elasticsearch.service;

import com.arsatapathy.elasticsearch.model.Employee;
import com.arsatapathy.elasticsearch.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepo repo;

    @Autowired
    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        repo.findAll().forEach(employees::add);

        return employees;
    }
}
