package com.session5;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> players = new HashSet<>();
        players.add("Roger Federer");
        players.add("Rafael Nadal");
        players.add("Andre Agassi");
        players.add("Serena Williams");
        players.add("Novak Djokovic");
        players.add("Roger Federer");
        players.add(null);
        players.add(null);
        System.out.println(players.size());
        for (String player : players) {
            System.out.println(player);
        }
    }
}
