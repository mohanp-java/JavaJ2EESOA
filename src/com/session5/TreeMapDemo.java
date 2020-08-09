package com.session5;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> learnermap = new TreeMap<>();
        learnermap.put(500, "Amit");
        learnermap.put(100, "Shreya");
        learnermap.put(200, "Srikiran");
        learnermap.put(300, "Collen");
        learnermap.put(400, "Mohan");
        learnermap.remove(500);
        System.out.println(learnermap.size());
        learnermap.clear();
        System.out.println(learnermap.size());
        System.out.println(learnermap);
    }
}
