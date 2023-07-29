package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int length = entry.getKey().length();
            Set<String> set = map.get(length);
            if (set == null) {
                set = new HashSet<>();
                map.put(length, set);
            }
            set.add(entry.getKey());
        }

        return map;
    }
}
