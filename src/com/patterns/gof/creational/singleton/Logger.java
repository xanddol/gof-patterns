package com.patterns.gof.creational.singleton;

public class Logger {

    private static Logger logger;
    private static String logFile = "this is log file";

    private Logger() {}

    public static synchronized Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    public void addInfo(String info) {
        logFile += info;
    }

    public String showInfo() {
        return logFile;
    }
}
