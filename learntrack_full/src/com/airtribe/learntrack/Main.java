package com.airtribe.learntrack;

import com.airtribe.learntrack.constants.MenuOptions;
import com.airtribe.learntrack.service.*;
import com.airtribe.learntrack.repository.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentRepository studentRepo = new StudentRepository();
        CourseRepository courseRepo = new CourseRepository();
        EnrollmentRepository enrollRepo = new EnrollmentRepository();

        StudentService studentService = new StudentService(studentRepo);
        CourseService courseService = new CourseService(courseRepo);
        EnrollmentService enrollmentService = new EnrollmentService(enrollRepo, studentRepo, courseRepo);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== LearnTrack Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Courses");
            System.out.println("6. View Enrollments");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case MenuOptions.ADD_STUDENT:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.println("Created: " + studentService.createStudent(name, email));
                    break;

                case MenuOptions.ADD_COURSE:
                    System.out.print("Enter course title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter instructor: ");
                    String instructor = sc.nextLine();
                    System.out.println("Created: " + courseService.createCourse(title, instructor));
                    break;

                case MenuOptions.ENROLL_STUDENT:
                    System.out.print("Student ID: ");
                    String sid = sc.nextLine();
                    System.out.print("Course ID: ");
                    String cid = sc.nextLine();
                    System.out.println("Enrollment: " + enrollmentService.enroll(sid, cid));
                    break;

                case MenuOptions.VIEW_STUDENTS:
                    studentService.listStudents();
                    break;

                case MenuOptions.VIEW_COURSES:
                    courseService.listCourses();
                    break;

                case MenuOptions.VIEW_ENROLLMENTS:
                    enrollmentService.listEnrollments();
                    break;

                case MenuOptions.EXIT:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
