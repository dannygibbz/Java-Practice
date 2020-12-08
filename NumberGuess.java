package com.ss.basics.homework;

/* This is the homework assignment for Day 1 of Smoothstack training. Users must guess within plus or minus 10 of a random number.
 * 
 *  
 *  @author DanielGibbons
 *  */

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {

    public static void main(String[] args) {

        int count = 0;
        int answer, guess;
        final int MAX = 100;
        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();


        answer = rand.nextInt(MAX) + 1;

        while (!correct && count < 5) {
            System.out.print("Your guess is: ");
            guess = keyboard.nextInt();
            int distance = guess - answer;
            count++;


            if (distance > 10) {
                System.out.println("You need to guess lower.");
            } else if (distance < -10) {
                System.out.println("You need to guess higher.");
            } else {
                correct = true;
            }

        }

        if (count == 5) {
            System.out.println("Sorry. The number was " + answer);
        } else {
            System.out.println("You guessed correctly.");
        }
    }

}