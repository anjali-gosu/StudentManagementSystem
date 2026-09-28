package com.example.StudentManagementSystem.service;

import java.util.List;

import com.example.StudentManagementSystem.Entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    Student updateStudent(Student student);

    void deleteStudent(int id);

}
