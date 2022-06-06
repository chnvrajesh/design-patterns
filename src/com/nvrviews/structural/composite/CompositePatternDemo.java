package com.nvrviews.structural.composite;

/**
 *  1. We can use it when we need to treat all the object in the structure as same. Ex: apply theme
 *  2. Composite pattern is a partitioning design pattern
 *  3. The intent of Composite Design Pattern is to COMPOSE objects into tree structure to represent PART-WHOLE
 *      relationship
 */

public class CompositePatternDemo {
    public static void main(String[] args) {
        Project project = new Project("BofA");

        Supervisor s1 = new Supervisor("Rakesh", "AM");
        s1.addTeamMember(new Developer("Pranati", "SSE-Dev"));
        s1.addTeamMember(new Developer("Raja", "SSE-Dev"));

        Supervisor s2 = new Supervisor("Ayush", "AM");
        s2.addTeamMember(new Developer("Raji", "SSE-QA"));
        s2.addTeamMember(new Developer("Debayan", "SSE-QA"));

        project.addTeam(s1);
        project.addTeam(s2);
        project.displayEmployeeDetails();
    }
}
