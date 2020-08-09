package com.session5;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>() ;

        for ( int i = 1; i  <= 10; i++ ){
            pq.add (i) ;
        }
        System.out.println(pq);
        System.out.println("*********Peek ***********");
        for ( int i = 1; i  <= 10; i++ ){
            Integer c = pq.peek();// peek - retrieves the first element of the queue
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("********Poll*********");
        for ( int i = 1; i  <= 10; i++ ){
            Integer c = pq.poll();// poll - retrieves and removes the first element of the Queue
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("***********************");
        System.out.println(pq);
    }
}
