package com.multileveluniversitycoursemanagement;

public abstract class CourseType {
    private String courseName;
    private int credits;

    public CourseType(String courseName,int credits){
        this.courseName=courseName;
        this.credits=credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString(){
        return "Course Name is : "+courseName+"( Credits : "+credits+" )";
    }

}
