package com.patterns.gof.creational.abstractfactory.website;

import com.patterns.gof.creational.abstractfactory.Developer;

class PhpDeveloper implements Developer {

    public void writeCode() {
        System.out.println("Php dev writes website Php code");
    }
}
