package com.patterns.gof.creational.factorymethod;

import com.patterns.gof.creational.factorymethod.developer.Developer;
import com.patterns.gof.creational.factorymethod.factory.CppDeveloperFactory;
import com.patterns.gof.creational.factorymethod.factory.DeveloperFactory;
import com.patterns.gof.creational.factorymethod.factory.JavaDeveloperFactory;
import com.patterns.gof.creational.factorymethod.factory.PhpDeveloperFactory;

public class Client {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown");
        }
    }
}
