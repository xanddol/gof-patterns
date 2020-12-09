package com.patterns.gof.behaviour.visitor;

public class JuniorDeveloperVisitor implements DeveloperVisitor {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop DB...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Writing poor tests...");
    }
}
