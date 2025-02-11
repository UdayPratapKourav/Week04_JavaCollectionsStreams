package com.aidrivenresumescreeningsystem;

public class Resume <T extends JobRole>{
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void process() {
        jobRole.displayRoleDetails();
        System.out.println("Resume processed successfully.\n");
    }
}
