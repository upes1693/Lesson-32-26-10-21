package com.collections_java;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(11111, "David");
        map.put(20000, "Mark");
        map.put(40000, "John");
        map.put(55555, "Daniel");
        map.put(765421, "Josh");
        map.put(11111,"Abc");
        map.put(23543,"Daniel");
        map.remove(765421);
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key " + entry.getKey() + " value " + entry.getValue());
        }

       // map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e-> System.out.println(e.getValue()));

    }
}
