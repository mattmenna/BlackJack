package com.company;

public class Main {

    public static void main(String[] args) {
        boolean pHit = true;
        boolean dHit = true;

	// write your code here
        System.out.println("Welcome to Menna's blackjack program");
        Player playerOne = new Player("Player 1");
        Player Dealer = new Player("Dealer");
        System.out.println("Dealing");
        //System.out.println("First player has ");
        playerOne.status(true);

        //System.out.println("Dealer player has ");
        Dealer.status(true);

        for(int i=0; i<8;i++) {

            if(pHit==true){playerOne.deal(i);}
            if(dHit==true){Dealer.deal(i);}

            playerOne.status(true);
            Dealer.status(true);

            if(playerOne.checkSum(playerOne.status(false))>=17){
                pHit = false;
            }

            if(Dealer.checkSum(Dealer.status(false))>=19){
                dHit = false;
            }

            System.out.println("--------- Round "+ i+ " ----------");

            if(pHit == false && dHit == false){
                System.out.println("Final Scores are ");
                playerOne.checkSum(playerOne.status(false));
                Dealer.checkSum(Dealer.status(false));
                return;
                }
        }

    }
}