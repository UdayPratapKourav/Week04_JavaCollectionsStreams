package com.multileveluniversitycoursemanagement;

public class ResearchCourse extends CourseType{
    private int researchCount;
    ResearchCourse(String courseName,int credits,int researchCount){
        super(courseName,credits);
        this.researchCount=researchCount;
    }

    public int getResearchCount() {
        return researchCount;
    }
    public String toString(){
        return super.toString()+" [Research: " + researchCount + "]";
    }
}
