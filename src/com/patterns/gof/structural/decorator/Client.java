package com.patterns.gof.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Developer dev = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(dev.makeJob());
    }
}
