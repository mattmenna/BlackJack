package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Menna's blackjack program");
        Player playerOne = new Player("Player 1");
        Player Dealer = new Player("Dealer");
        System.out.println("Dealing");
        System.out.println("First player has ");
        playerOne.deal();

        System.out.println("Dealer player has ");
        Dealer.deal();
    }
}