package com.arsatapathy.elasticsearch.service;

import com.arsatapathy.elasticsearch.model.Student;
import com.arsatapathy.elasticsearch.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepo repo;

    @Autowired
    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        repo.findAll().forEach(students::add);

        return students;
    }
}
