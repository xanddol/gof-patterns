package com.patterns.gof.behaviour.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(DeveloperVisitor developerVisitor) {
        developerVisitor.create(this);
    }
}
