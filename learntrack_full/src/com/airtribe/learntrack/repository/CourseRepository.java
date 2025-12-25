package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Course;
import java.util.*;

public class CourseRepository {
    private final Map<String, Course> courses = new HashMap<>();

    public void save(Course c) { courses.put(c.getId(), c); }

    public Course findById(String id) { return courses.get(id); }

    public Collection<Course> findAll() { return courses.values(); }
}
