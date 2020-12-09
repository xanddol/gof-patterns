package com.patterns.gof.structural.adapter;

public interface Database {
    void insert();
    void update();
    void select();
    void remove();
}
