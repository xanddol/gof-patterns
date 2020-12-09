package com.patterns.gof.behaviour.memento;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Repo repo = new Repo();

        System.out.println("Creating new Project Version 1.0...");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current project...");
        repo.setSave(project.save());

        Thread.sleep(5000l);
        System.out.println("Saving current project to version 2.0...");
        project.setVersionAndDate("Version 2.0");
        System.out.println(project);

        System.out.println("Reverting changes to the project...");
        project.load(repo.getSave());
        System.out.println(project);
    }
}
