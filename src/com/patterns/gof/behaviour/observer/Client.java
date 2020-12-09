package com.patterns.gof.behaviour.observer;

public class Client {
    public static void main(String[] args) {
        JavaDeveloperSite jobSite = new JavaDeveloperSite();
        jobSite.addVacancy("Java Dev1");
        jobSite.addVacancy("Senior java dev");

        Observer sub1 = new Subscriber("Tom");
        Observer sub2 = new Subscriber("Sam");

        jobSite.addObserver(sub1);
        jobSite.addObserver(sub2);

        jobSite.addVacancy("Team lead java");

        jobSite.removeVacancy("Senior java dev");
    }
}
