package com.patterns.gof.structural.proxy;

public class RealProjectProxy implements Project {

    private String url;
    private RealProject realProject;

    public RealProjectProxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject = new RealProject(url);
        }
        realProject.run();
    }
}
