/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber;
        int guess;
        
        randomNumber = rand.nextInt(10) + 1;
        guess = -1;
        
        System.out.println("Jeffrey's guessing game.");
        System.out.println("Guess a number from 1 - 10.");
        
        while(guess != randomNumber){
            System.out.print("Enter a number: ");
            guess = Integer.parseInt(sc.nextLine());
            if(guess == randomNumber){
                System.out.println("You guessed it!");
            }
            else{
                System.out.println("Sorry, wrong number.");
            }
        }
    }  
}