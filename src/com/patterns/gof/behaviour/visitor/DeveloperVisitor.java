package com.patterns.gof.behaviour.visitor;

public interface DeveloperVisitor {
    void create(ProjectClass projectClass);
    void create(Database database);
    void create(Test test);
}
