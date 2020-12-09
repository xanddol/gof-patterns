package com.patterns.gof.structural.facade;

public class Client {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.solveProblems();
    }
}
