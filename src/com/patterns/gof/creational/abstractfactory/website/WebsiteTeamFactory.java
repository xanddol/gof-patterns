package com.patterns.gof.creational.abstractfactory.website;

import com.patterns.gof.creational.abstractfactory.Developer;
import com.patterns.gof.creational.abstractfactory.Manager;
import com.patterns.gof.creational.abstractfactory.TeamFactory;
import com.patterns.gof.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsiteProjectManager();
    }
}
