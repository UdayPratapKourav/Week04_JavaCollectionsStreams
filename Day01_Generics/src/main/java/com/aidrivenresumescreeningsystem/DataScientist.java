package com.aidrivenresumescreeningsystem;

public class DataScientist extends JobRole{
    public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println(getCandidateName() + " applied for Data Scientist role.");
    }
}
