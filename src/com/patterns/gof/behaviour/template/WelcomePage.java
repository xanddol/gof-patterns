package com.patterns.gof.behaviour.template;

public class WelcomePage extends WebSiteTemplate {

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
