package com.aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName) {
        super(candidateName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println(getCandidateName() + " applied for Software Engineer role.");
    }
}
