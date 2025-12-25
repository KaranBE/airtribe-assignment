package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Course;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.CourseRepository;
import com.airtribe.learntrack.util.IdGenerator;

public class CourseService {
    private final CourseRepository repo;

    public CourseService(CourseRepository repo) {
        this.repo = repo;
    }

    public Course createCourse(String title, String instructor) {
        Course c = new Course(IdGenerator.generate(), title, instructor);
        repo.save(c);
        return c;
    }

    public Course getCourse(String id) {
        Course c = repo.findById(id);
        if (c == null) throw new EntityNotFoundException("Course not found");
        return c;
    }

    public void listCourses() {
        repo.findAll().forEach(System.out::println);
    }
}
