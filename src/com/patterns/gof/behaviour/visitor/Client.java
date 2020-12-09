package com.patterns.gof.behaviour.visitor;

public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        JuniorDeveloperVisitor juniorDeveloper = new JuniorDeveloperVisitor();
        SeniorDeveloperVisitor seniorDeveloper = new SeniorDeveloperVisitor();

        System.out.println("Junior in action");
        project.beWritten(juniorDeveloper);

        System.out.println("Senior in action");
        project.beWritten(seniorDeveloper);
    }
}
