package com.company;

import java.util.ArrayList;

/**
 * Created by Matt on 6/1/2017.
 */
public class Player {

    public Player(String name) {
        System.out.println(name);
    }

    public int[] deal(){
       int[] hand;
       hand = new int[10];

       for(int i=0; i<10; i++ ) {
           hand[i]=i+2;
           System.out.println(hand[i]);
       }
       return hand;
    }
}
