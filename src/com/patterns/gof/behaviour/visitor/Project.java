package com.patterns.gof.behaviour.visitor;

public class Project implements ProjectElement {

    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(), new Database(), new Test()
        };
    }

    @Override
    public void beWritten(DeveloperVisitor developerVisitor) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developerVisitor);
        }
    }
}
