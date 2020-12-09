package com.patterns.gof.behaviour.visitor;

public class Database implements ProjectElement {
    @Override
    public void beWritten(DeveloperVisitor developerVisitor) {
        developerVisitor.create(this);
    }
}
