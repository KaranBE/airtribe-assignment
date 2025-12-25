package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.CourseStatus;

public class Course {
    private String id;
    private String title;
    private String instructor;
    private CourseStatus status;

    public Course(String id, String title, String instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.status = CourseStatus.ACTIVE;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getInstructor() { return instructor; }
    public CourseStatus getStatus() { return status; }

    @Override
    public String toString() {
        return "Course{ id='" + id + "', title='" + title + "', instructor='" + instructor +
                "', status='" + status + "' }";
    }
}
