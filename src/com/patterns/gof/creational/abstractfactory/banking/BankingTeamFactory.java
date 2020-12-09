package com.patterns.gof.creational.abstractfactory.banking;

import com.patterns.gof.creational.abstractfactory.Developer;
import com.patterns.gof.creational.abstractfactory.Manager;
import com.patterns.gof.creational.abstractfactory.TeamFactory;
import com.patterns.gof.creational.abstractfactory.Tester;

public class BankingTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public Manager getManager() {
        return new BankingProjectManager();
    }
}
