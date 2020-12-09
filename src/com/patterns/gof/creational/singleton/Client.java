package com.patterns.gof.creational.singleton;

public class Client {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.showInfo();
        logger = Logger.getLogger();
        logger.addInfo("test");
        System.out.println(logger.showInfo());
    }
}
