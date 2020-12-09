package com.patterns.gof.creational.abstractfactory.banking;

import com.patterns.gof.creational.abstractfactory.Manager;

public class BankingProjectManager implements Manager {
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
