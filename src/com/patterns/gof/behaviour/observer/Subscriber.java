package com.patterns.gof.behaviour.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + " we have some updates in vacancies");
        System.out.println(vacancies);
    }
}
