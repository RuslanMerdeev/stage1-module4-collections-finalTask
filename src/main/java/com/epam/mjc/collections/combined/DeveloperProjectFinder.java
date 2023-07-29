package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                list.add(entry.getKey());
            }
        }

        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            }
            return o2.length() - o1.length();
        });
        return list;
    }
}
