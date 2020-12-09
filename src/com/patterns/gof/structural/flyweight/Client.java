package com.patterns.gof.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developerList = new ArrayList<>();
        developerList.add(developerFactory.getDeveloper("java"));
        developerList.add(developerFactory.getDeveloper("java"));
        developerList.add(developerFactory.getDeveloper("java"));

        developerList.add(developerFactory.getDeveloper("cpp"));
        developerList.add(developerFactory.getDeveloper("cpp"));
        developerList.add(developerFactory.getDeveloper("cpp"));

        developerList.forEach(Developer::writeCode);
    }
}
