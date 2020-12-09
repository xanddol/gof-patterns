package com.patterns.gof.structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange dev in progress...");
        developer.writeCode();
    }
}
