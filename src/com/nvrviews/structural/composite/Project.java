package com.nvrviews.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Project implements Employee{

    private String name;

    public Project(String name) {
        this.name = name;
    }

    List<Employee> team = new ArrayList<>();

    @Override
    public void displayEmployeeDetails() {
        team.forEach(Employee::displayEmployeeDetails);
    }

    public void addTeam(Employee e){
        team.add(e);
    }

}
