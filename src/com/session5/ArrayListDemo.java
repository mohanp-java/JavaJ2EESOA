package com.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("First");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.set(2, "Fourth"));
        System.out.println(list);
        list.remove(3);

        List<String> list1 = Arrays.asList("Fifth", "Sixth", "Seventh", "Seventh");
        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.indexOf("Seventh"));
        System.out.println(list.lastIndexOf("Seventh"));
        list.clear();
        System.out.println(list);
    }
}
