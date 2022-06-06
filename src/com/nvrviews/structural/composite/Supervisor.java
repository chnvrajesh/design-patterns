package com.nvrviews.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Employee {

    private String name;
    private String designation;

    public Supervisor(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    private List<Employee> team = new ArrayList<>();


    @Override
    public void displayEmployeeDetails() {
        System.out.println("\nSupervisor: " + name);
        System.out.println("Team:");
        team.forEach(Employee::displayEmployeeDetails);
    }

    public void addTeamMember(Employee e){
        team.add(e);
    }
}
