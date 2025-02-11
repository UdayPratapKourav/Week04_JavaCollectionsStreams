package com.multileveluniversitycoursemanagement;

public class ExamCourse extends CourseType {
    private int examWeightage;
    public ExamCourse(String courseName,int credits,int examWeightage){
        super(courseName,credits);
        this.examWeightage=examWeightage;
    }

    public int getExamWeightage() {
        return examWeightage;
    }
    public String toString() {
        return super.toString() + " [Exam Weightage: " + examWeightage + "%]";
    }
}
