package com.patterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Dev> devs = new ArrayList<>();

    public void addDev(Dev dev) {
        devs.add(dev);
    }

    public void removeDev(Dev dev) {
        devs.remove(dev);
    }

    public void createProject() {
        System.out.println("Team creats project");
        devs.forEach(Dev::writeCode);
    }
}
