package com.patterns.gof.structural.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp dev writes cpp code...");
    }
}
