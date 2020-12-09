package com.patterns.gof.behaviour.iterator;

public class Client {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "SQL"};
        JavaDeveloper developer = new JavaDeveloper("Tom", skills);
        Iterator iterator = developer.getIterator();
        System.out.printf("Dev " + developer.getName());
        while (iterator.hasNext()) {
            System.out.println("Skill " + iterator.next().toString());
        }

    }
}
