package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.StudentRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student createStudent(String name, String email) {
        String id = IdGenerator.generate();
        Student s = new Student(id, name, email);
        repo.save(s);
        return s;
    }

    public Student getStudent(String id) {
        Student s = repo.findById(id);
        if (s == null) throw new EntityNotFoundException("Student not found");
        return s;
    }

    public void listStudents() {
        repo.findAll().forEach(System.out::println);
    }
}
