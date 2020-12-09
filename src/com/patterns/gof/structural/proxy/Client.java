package com.patterns.gof.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Project project = new RealProjectProxy("https://www.github.com/testtest/realProject");

        project.run();
    }
}
