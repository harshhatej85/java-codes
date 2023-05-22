package Core_Java;

import java.util.Random;
import java.util.Scanner;

//Create a simple Rock, Paper Scissors game in Java. (#Use Conditional Statements)

public class Java_Exercise_2 {
    public static void main(String[] args) {
        System.out.println("Press Y to play Rock, Paper, Scissor!!!");
        Scanner sc = new Scanner(System.in);
        char play = sc.next().charAt(0);
        if (play == 'Y' || play == 'y') {
            byte cpu_score = 0;
            byte player_score = 0;
            System.out.println("Instructions -- 0 for Rock , 1 for Paper , 2 for Scissor.\n the best of 5 matches win !");
            for (int i = 0; i < 5; i++) {

                System.out.println(" \n Enter Your Play : ");

                byte UserInput = sc.nextByte();
                Random chance = new Random();
                int ComputerInput = chance.nextInt(3);

                if (UserInput == ComputerInput) {
                    System.out.println("It's a draw!");
                    System.out.println("The user selected : " + UserInput);
                    System.out.println("The computer selected : " + ComputerInput);
                } else if (UserInput == 0) {
                    if (ComputerInput == 1) {
                        System.out.println("CPU wins!");
                        cpu_score += 1;
                    } else {
                        System.out.println("Player wins!");
                        player_score += 1;
                    }
                    System.out.println("The user selected : " + UserInput);
                    System.out.println("The computer selected : " + ComputerInput);

                } else if (UserInput == 1) {
                    if (ComputerInput == 2) {
                        System.out.println("CPU wins!");
                        cpu_score += 1;
                    } else {
                        System.out.println("Player wins!");
                        player_score += 1;
                    }
                    System.out.println("The user selected : " + UserInput);
                    System.out.println("The computer selected : " + ComputerInput);

                } else if (UserInput == 2) {
                    if (ComputerInput == 0) {
                        System.out.println("CPU wins!");
                        cpu_score += 1;
                    } else {
                        System.out.println("Player wins!");
                        player_score += 1;
                    }
                    System.out.println("The user selected : " + UserInput);
                    System.out.println("The computer selected : " + ComputerInput);
                }


            }
            if (cpu_score > player_score) {
                System.out.println("\n CPU won the match! try again..");
            }
            if (player_score > cpu_score) {
                System.out.println("\n Congratulations You won the match!!!");
            }
            if (cpu_score == player_score) {
                System.out.println("\n The match is tied !");
            }
        } else {
            System.out.println("Have a nice day !");
        }
    }
}

