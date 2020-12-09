package com.patterns.gof.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> devs = new HashMap<>();

    public Developer getDeveloper(String spec) {
        Developer developer = devs.get(spec);
        if (developer == null) {
            switch (spec) {
                case "java":
                    System.out.println("Hire java dev");
                    developer = new JavaDeveloper();
                    break;
                case "cpp":
                    System.out.println("Hire cpp dev");
                    developer = new CppDeveloper();
                    break;
            }
            devs.put(spec, developer);
        }
        return developer;
    }
}
