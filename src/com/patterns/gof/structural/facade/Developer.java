package com.patterns.gof.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Dev is solving issues...");
        } else {
            System.out.println("Dev is reading habr...");
        }
    }
}
