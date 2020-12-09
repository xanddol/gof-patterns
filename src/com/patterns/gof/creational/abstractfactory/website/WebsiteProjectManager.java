package com.patterns.gof.creational.abstractfactory.website;

import com.patterns.gof.creational.abstractfactory.Manager;

public class WebsiteProjectManager implements Manager {
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
