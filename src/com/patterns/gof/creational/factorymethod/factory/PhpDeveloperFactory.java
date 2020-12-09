package com.patterns.gof.creational.factorymethod.factory;

import com.patterns.gof.creational.factorymethod.developer.Developer;
import com.patterns.gof.creational.factorymethod.developer.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
