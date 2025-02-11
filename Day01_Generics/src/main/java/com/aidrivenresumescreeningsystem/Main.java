package com.aidrivenresumescreeningsystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie"));

        // Process individual resumes
        seResume.process();
        dsResume.process();
        pmResume.process();

        // Screening pipeline for multiple resumes
        List<JobRole> jobRoles = Arrays.asList(
                seResume.getJobRole(),
                dsResume.getJobRole(),
                pmResume.getJobRole()
        );

        System.out.println("--- Screening Pipeline ---");
        ScreeningPipeline.processResumes(jobRoles);
    }
}
