package com.patterns.gof.creational.abstractfactory;

import com.patterns.gof.creational.abstractfactory.banking.BankingTeamFactory;
import com.patterns.gof.creational.abstractfactory.website.WebsiteTeamFactory;

public class WebsiteProject {

    public static void main(String[] args) {
        TeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        Manager manager = teamFactory.getManager();

        System.out.println("Creating website system...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
