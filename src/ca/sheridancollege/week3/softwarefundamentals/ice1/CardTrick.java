package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Modified by Karamjot Singh (Student Number: 991678242)
 */

public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card c = new Card();
            Random rand = new Random();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            hand[i] = c;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of your card (1-13):");
        int userValue = scanner.nextInt();
        System.out.println("Enter the suit of your card (0-3):");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        boolean found = false;

        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");

    
         Card luckyCard = new Card();
        luckyCard.setValue(7);  
        luckyCard.setSuit(Card.SUITS[2]);

        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
        if (luckyCard.equals(userCard)) {
            System.out.println("Congratulations! You found the lucky card!");
        } else {
            System.out.println("The lucky card is not your card. Better luck next time!");
        }
    }
    }
}

