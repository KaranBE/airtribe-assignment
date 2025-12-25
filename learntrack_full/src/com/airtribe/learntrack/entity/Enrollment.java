package com.airtribe.learntrack.entity;

import com.airtribe.learntrack.enums.EnrollmentStatus;

public class Enrollment {
    private String id;
    private String studentId;
    private String courseId;
    private EnrollmentStatus status;

    public Enrollment(String id, String studentId, String courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = EnrollmentStatus.ENROLLED;
    }

    public String getId() { return id; }
    public String getStudentId() { return studentId; }
    public String getCourseId() { return courseId; }
    public EnrollmentStatus getStatus() { return status; }

    public void setStatus(EnrollmentStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Enrollment{ id='" + id + "', studentId='" + studentId +
                "', courseId='" + courseId + "', status='" + status + "' }";
    }
}
