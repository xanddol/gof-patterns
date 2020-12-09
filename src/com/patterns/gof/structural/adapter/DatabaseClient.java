package com.patterns.gof.structural.adapter;

public class DatabaseClient {

    public static void main(String[] args) {
        Database database = new JavaToDatabaseAdapter();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
