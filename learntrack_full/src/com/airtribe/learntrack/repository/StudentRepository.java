package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Student;
import java.util.*;

public class StudentRepository {
    private final Map<String, Student> students = new HashMap<>();

    public void save(Student s) { students.put(s.getId(), s); }

    public Student findById(String id) { return students.get(id); }

    public Collection<Student> findAll() { return students.values(); }
}
