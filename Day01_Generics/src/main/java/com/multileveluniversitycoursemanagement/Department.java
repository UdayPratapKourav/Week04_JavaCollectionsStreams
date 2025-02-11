package com.multileveluniversitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class Department <T extends CourseType>{
    private List<Course<? extends CourseType>> courses;

    public Department() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }
}
