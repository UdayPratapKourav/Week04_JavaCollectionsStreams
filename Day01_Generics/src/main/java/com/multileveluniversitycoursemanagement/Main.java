package com.multileveluniversitycoursemanagement;

public class Main {
    public static void main(String[] args) {
        Department<CourseType> department = new Department<>();

        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics", 4, 70));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Software Engineering", 3, 5));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("AI Research", 6, 10));

        department.addCourse(examCourse);
        department.addCourse(assignmentCourse);
        department.addCourse( researchCourse);

        System.out.println("--- University Course Catalog ---");
        department.displayCourses();

    }
}
