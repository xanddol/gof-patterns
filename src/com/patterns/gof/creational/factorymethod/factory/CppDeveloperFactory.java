package com.patterns.gof.creational.factorymethod.factory;

import com.patterns.gof.creational.factorymethod.developer.CppDeveloper;
import com.patterns.gof.creational.factorymethod.developer.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
