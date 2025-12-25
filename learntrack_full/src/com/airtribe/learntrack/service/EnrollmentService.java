package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.exception.EntityNotFoundException;
import com.airtribe.learntrack.repository.*;
import com.airtribe.learntrack.util.IdGenerator;

public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepo;
    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;

    public EnrollmentService(EnrollmentRepository e, StudentRepository s, CourseRepository c) {
        this.enrollmentRepo = e;
        this.studentRepo = s;
        this.courseRepo = c;
    }

    public Enrollment enroll(String studentId, String courseId) {
        if (studentRepo.findById(studentId) == null)
            throw new EntityNotFoundException("Student does not exist");

        if (courseRepo.findById(courseId) == null)
            throw new EntityNotFoundException("Course does not exist");

        Enrollment e = new Enrollment(IdGenerator.generate(), studentId, courseId);
        enrollmentRepo.save(e);
        return e;
    }

    public void listEnrollments() {
        enrollmentRepo.findAll().forEach(System.out::println);
    }
}
