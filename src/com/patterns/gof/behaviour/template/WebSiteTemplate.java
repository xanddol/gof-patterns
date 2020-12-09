package com.patterns.gof.behaviour.template;

public abstract class WebSiteTemplate {
    void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
