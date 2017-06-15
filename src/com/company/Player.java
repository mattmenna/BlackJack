package com.company;

import java.util.Random;

/**
 * Created by Matt on 6/1/2017.
 */
public class Player {

    public int[] playerHand = {0, 0, 0, 0, 0, 0, 0, 0};
    public String playerName;

    public Player(String name) {
        System.out.println(name);
        playerName = name;
    }

    public int[] status(boolean displayFlag) {
        if (displayFlag){
        System.out.println("Hand");
        for (int i = 0; i < playerHand.length; i++) {
            System.out.print(playerHand[i]+ " ");

        }
        }
        System.out.println();
        return playerHand;
    }

    public void deal(int cardNumber) {
        Random r = new Random();
        int card = r.nextInt(9);
        playerHand[cardNumber] = card;
    }

    public int checkSum(int[] playerHand){
        int handsum = 0;
        for (int i = 0; i < playerHand.length; i++) {
            handsum = handsum + playerHand[i];
        }
        System.out.println(handsum);
        return handsum;
    }
}
