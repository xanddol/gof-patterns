package com.patterns.gof.behaviour.template;

public class NewsPage extends WebSiteTemplate {

    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}
