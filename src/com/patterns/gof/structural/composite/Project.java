package com.patterns.gof.structural.composite;

public class Project {

    public static void main(String[] args) {
        Team team = new Team();

        Dev firstJavaDev = new JavaDev();
        Dev secondJavaDev = new JavaDev();
        Dev cppDev = new CppDev();

        team.addDev(firstJavaDev);
        team.addDev(secondJavaDev);
        team.addDev(cppDev);

        team.createProject();
    }
}
