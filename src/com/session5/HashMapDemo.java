package com.session5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> learnermap = new HashMap<>();
        learnermap.put(100, "Shreya");
        learnermap.put(200, "Srikiran");
        learnermap.put(300, "Collen");
        learnermap.put(400, "Mohan");
        learnermap.put(500, "Amit");
        learnermap.put(null, "Amirtha");
        learnermap.put(100, "Murtaza");
        System.out.println(learnermap);
        Iterator<Map.Entry<Integer, String>> iterator = learnermap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value :" + entry.getValue());
        }

    }
}
