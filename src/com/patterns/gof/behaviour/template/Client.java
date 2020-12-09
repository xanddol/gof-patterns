package com.patterns.gof.behaviour.template;

public class Client {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        WebSiteTemplate newsPage = new NewsPage();
        welcomePage.showPage();
        System.out.println("====================");
        newsPage.showPage();
    }
}
