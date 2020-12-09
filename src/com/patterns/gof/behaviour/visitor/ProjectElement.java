package com.patterns.gof.behaviour.visitor;

public interface ProjectElement {
    void beWritten(DeveloperVisitor developerVisitor);
}
