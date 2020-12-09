package com.patterns.gof.behaviour.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
