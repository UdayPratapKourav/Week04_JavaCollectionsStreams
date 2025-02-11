package com.aidrivenresumescreeningsystem;

public class ProductManager extends JobRole{
    public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println(getCandidateName() + " applied for Product Manager role.");
    }
}
