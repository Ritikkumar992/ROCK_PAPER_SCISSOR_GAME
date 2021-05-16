package com.company;

import java.net.InetSocketAddress;
import java.util.Random;
import java.util.Scanner;

public class Lec_20_Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        //user input for game .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userInput = sc.nextInt();

        //Random function to declare Computer input as a random number.
        Random random = new Random();
        int computerInput = random.nextInt(3);

        //key step
        if(userInput == computerInput)
        {
            System.out.println("DRAW");
        }
        else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1)
        {
            System.out.println("YOU WIN !!!");
        }
        else
        {
            System.out.println("COMPUTER WIN!!!");
        }
        //System.out.println("Computer choice is : " + computerInput);
        if(computerInput == 0){
            System.out.println("Computer choice is : Rock ");
        }
        else if(computerInput == 1){
            System.out.println("Computer choice is : Paper ");
        }
        else if(computerInput == 2){
            System.out.println("Computer choice is : Scissor ");
        }

    }
}
