package com.multileveluniversitycoursemanagement;

public class Course <T extends CourseType>{
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return courseType.toString();
    }
}
