package com.patterns.gof.behaviour.chain;

public class Client {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SmsNotifier(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifyManager("Everything Ok", Priority.ROUTINE);
        report.notifyManager("Smth wrong", Priority.IMPORTANT);
        report.notifyManager("Mayday mayday", Priority.ASAP);
    }
}
