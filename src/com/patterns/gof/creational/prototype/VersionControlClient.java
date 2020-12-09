package com.patterns.gof.creational.prototype;

public class VersionControlClient {

    public static void main(String[] args) {
        Project master = new Project(1, "new project", "test1111");
        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone2 = projectFactory.cloneProject();
        System.out.println(masterClone2);
    }
}
