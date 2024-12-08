package Methods;

import java.util.Scanner;

public class Question2 {

    /*Create a guessing game! The computer will generate a random
    integer that will be unknown to the user. The user gets 5 chances to
    guess the number. Once the user either guesses the number correctly or
    the user does not guess the number correctly within 5 chances, allow the
    user to restart the program.*/

    //Answer:

    public static void runGuessingGame() {
        Scanner sc = new Scanner(System.in); //Scanner variable taking in user input.
        int randomNumber = (int) (Math.random() * 100); //Randomly generated number from 1 to 100.

        System.out.println("You have 5 chances to guess the random number.");

        for (int i = 0; i < 5; i++) { //Loops five times to give the user 5 chances to guess the random number.
            System.out.println("Take a guess.");
            int guess = sc.nextInt();

            if(guess == randomNumber) { //Is the user guesses correctly, then the program ends.
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Incorrect. Try again.");
            }

            if(i == 4) { //If the user doesn't answer correctly within five tries, then the program will ask the user if they want to retry the game.
                System.out.println("Do you want to restart the game?");
                String answer = sc.nextLine();

                if(answer.equalsIgnoreCase("yes")) {
                    System.out.println("Ok.");
                    runGuessingGame();
                }
            }
        }
    }

    public static void main(String[] args) {
        runGuessingGame(); //Referencing the method in "main" method to be able to run the program.
    }
}
