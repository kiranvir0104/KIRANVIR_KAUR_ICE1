/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Name - Kiranvir Kaur
* Student Id - 991687665
* Date modified - 31 May 2023

*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
   
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
       
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            
            int randomValue = (int)(Math.random()*13);
            String randomSuit = suits[(int)(Math.random()*4)];
   
            c.setValue(randomValue);
            c.setSuit(randomSuit);
            
            magicHand[i] = c;
        }
        
        
        // ask the user for Card value and suit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your card value (0-12)");
        int userValue = sc.nextInt();
        System.out.println("Enter your card suit (Hearts,Diamonds,Clubs,Spades):");
        String userSuit = sc.next();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // and search magicHand here
        boolean found = false;
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.equals(userCard)) {
                found = true;
                break;
            }
        }
        
        //Then report the result here
        if(found)
        {
            System.out.println("Your card is in the magic hand!");
        }
        else
        {
            System.out.println("Sorry,your card is not in the magic card");
        }
    }
   
}
