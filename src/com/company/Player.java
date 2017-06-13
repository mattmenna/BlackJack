package com.company;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Matt on 6/1/2017.
 */
public class Player {

    public int[] playerHand;
    public String playerName;

    public Player(String name) {
        System.out.println(name);
        playerName = name;

    }

    public void status(String name, int[] hand){
        System.out.println(name);
        for(int i=0; i<10; i++ ) {
            hand[i]=i+2;
            System.out.println(hand[i]);
        }
        }


    public int[] deal(){
       int[] hand= new int[10];

       for(int i=0; i<10; i++ ) {
           hand[i]=i+2;
           System.out.println(hand[i]);
       }

        return hand;
    }
}
