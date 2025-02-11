package com.aidrivenresumescreeningsystem;

import java.util.List;

public class ScreeningPipeline {
    public static void processResumes(List<? extends JobRole> jobRoles) {
        for (JobRole role : jobRoles) {
            role.displayRoleDetails();
            System.out.println("Screening completed for " + role.getCandidateName() + "\n");
        }
    }
}
