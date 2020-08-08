package com.session5;

public class WrapperDemo {

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        Integer integer = i;//Boxing
        System.out.println(integer);
        int j = integer.intValue(); //Unboxing
        System.out.println(integer.toString());

        Float aFloat = 34.565f;
        System.out.println(aFloat.byteValue());
        System.out.println(aFloat.intValue());
        System.out.println(aFloat.isNaN());
        System.out.println(aFloat.shortValue());

        System.out.println(Integer.valueOf("1"));
        Boolean aBoolean = true;
        Boolean aBoolean1 = Boolean.FALSE;
        System.out.println(aBoolean1);

        Character character = 'A';
        System.out.println(character);

        String s1 = args[0];
        String s2 = args[1];
        Integer i1 = Integer.parseInt(s1);
        Float f1 = Float.parseFloat(s2);
        System.out.println(i1);
        System.out.println(f1);

    }
}
