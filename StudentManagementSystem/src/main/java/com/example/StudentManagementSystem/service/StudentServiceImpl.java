package com.example.StudentManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagementSystem.Entity.*;
import com.example.StudentManagementSystem.repository.*;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

}