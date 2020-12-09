package com.patterns.gof.creational.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardBuilder());
        Website website = director.build();
        System.out.println(website);

    }
}
