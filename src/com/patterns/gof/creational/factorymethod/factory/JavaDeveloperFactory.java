package com.patterns.gof.creational.factorymethod.factory;

import com.patterns.gof.creational.factorymethod.developer.Developer;
import com.patterns.gof.creational.factorymethod.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
