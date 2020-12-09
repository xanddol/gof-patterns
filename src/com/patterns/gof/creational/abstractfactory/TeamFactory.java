package com.patterns.gof.creational.abstractfactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
