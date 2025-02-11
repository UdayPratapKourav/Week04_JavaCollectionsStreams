package com.multileveluniversitycoursemanagement;

public class AssignmentCourse extends CourseType{
    private int assignmentCount;
    public AssignmentCourse(String courseName,int credits,int assignmentCount){
        super(courseName,credits);
        this.assignmentCount=assignmentCount;
    }

    public int getAssignmentCount() {
        return assignmentCount;
    }

    public String toString(){

            return super.toString() + " [Assignments: " + assignmentCount + "]";

    }
}
