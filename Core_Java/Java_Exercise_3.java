package Core_Java;

import java.util.Random;
import java.util.Scanner;
//        Guess the Number (OOPs Edition)
//
//        Create a class Game, which allows a user to play "Guess the Number" game once.
//        Game should have the following methods:
//        - Constructor to generate the random number
//        - takeUserInput() to take a user input of number
//        - isCorrectNumber() to detect whether the number entered by the user is true
//        - getter and setter for noOfGuesses
//        - Use properties such as noOfGuesses(int), etc. to get this task done!


class Game {
    private int computerChoice;
    private int userChoice;
    private int noOfGuesses = 0;

    Game() {
        Random rand = new Random();
        computerChoice = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("\nGuess the number :");
        Scanner sc = new Scanner(System.in);
        userChoice = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (userChoice > 100 || userChoice < 0) {
            System.out.println("You Entered invalid number try again!");
        } else {
            if (userChoice == computerChoice) {
                System.out.println("Congratulations you won the game !");
                System.out.println("You guessed it in " + noOfGuesses + " tries.");
                return true;
            } else if (userChoice < computerChoice) {
                System.out.println("Your guess is less");

            } else if (userChoice > computerChoice) {
                System.out.println("Your guess is high");
            }
        }
        return false;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

}

public class Java_Exercise_3 {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();

        }
    }
}

