package com.patterns.gof.structural.bridge;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes java code...");
    }
}
