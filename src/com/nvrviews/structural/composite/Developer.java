package com.nvrviews.structural.composite;

public class Developer implements Employee{
    private String name;
    private String designation;

    public Developer(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public void displayEmployeeDetails() {
        System.out.println(this.name + " -- " + this.designation);
    }
}
