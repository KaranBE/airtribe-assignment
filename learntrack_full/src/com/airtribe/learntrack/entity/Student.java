package com.airtribe.learntrack.entity;

public class Student extends Person {
    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String toString() {
        return "Student{ id='" + id + "', name='" + name + "', email='" + email + "' }";
    }
}
