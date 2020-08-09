package com.session5;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> players = new TreeSet<>();
        players.add("Roger Federer");
        players.add("Rafael Nadal");
        players.add("Andre Agassi");
        players.add("Serena Williams");
        players.add("Novak Djokovic");
        players.add("Novak Djokovic");
        System.out.println(players);
        System.out.println(players.descendingSet());
    }
}
