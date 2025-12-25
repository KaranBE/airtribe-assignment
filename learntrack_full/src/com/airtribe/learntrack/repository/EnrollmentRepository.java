package com.airtribe.learntrack.repository;

import com.airtribe.learntrack.entity.Enrollment;
import java.util.*;

public class EnrollmentRepository {
    private final Map<String, Enrollment> enrollments = new HashMap<>();

    public void save(Enrollment e) { enrollments.put(e.getId(), e); }

    public Collection<Enrollment> findAll() { return enrollments.values(); }

    public List<Enrollment> findByStudentId(String id) {
        List<Enrollment> list = new ArrayList<>();
        for (Enrollment e : enrollments.values()) {
            if (e.getStudentId().equals(id)) list.add(e);
        }
        return list;
    }
}
