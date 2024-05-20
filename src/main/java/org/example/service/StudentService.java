package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(int studentId, String name) {
        Student student = new Student(name, studentId);
        studentRepository.addStudent(student);
    }
}
