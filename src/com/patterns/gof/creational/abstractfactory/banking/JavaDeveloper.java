package com.patterns.gof.creational.abstractfactory.banking;

import com.patterns.gof.creational.abstractfactory.Developer;

class JavaDeveloper implements Developer {

    public void writeCode() {
        System.out.println("Java dev writes banking Java code");
    }
}
