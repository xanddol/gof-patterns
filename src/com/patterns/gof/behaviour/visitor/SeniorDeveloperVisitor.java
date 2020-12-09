package com.patterns.gof.behaviour.visitor;

public class SeniorDeveloperVisitor implements DeveloperVisitor {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("ReWriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fix DB...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing good tests...");
    }
}
