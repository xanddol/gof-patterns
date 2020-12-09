package com.patterns.gof.creational.abstractfactory;

import com.patterns.gof.creational.abstractfactory.banking.BankingTeamFactory;

public class BankProject {

    public static void main(String[] args) {
        TeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        Manager manager = teamFactory.getManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
