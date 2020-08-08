package com.session5;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        System.out.println("*******Using enhanced for loop*********");
        //Enhanced for loop/for-each loop
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("*******Using iterator*****");
        //Using iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*********List iterator*******");
        ListIterator listIterator = list.listIterator(4);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("******Using Enumeration******");
        Enumeration enumeration = Collections.enumeration(list);
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
