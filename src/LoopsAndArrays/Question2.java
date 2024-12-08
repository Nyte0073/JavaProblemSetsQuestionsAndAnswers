package LoopsAndArrays;

import java.util.Scanner;

public class Question2 {

    /*Take a number from 1 to 7 from the user. Then, print the day
    of the week corresponding to that number. Monday will correspond
    to 1, while Sunday will correspond to 7. If the user input is not a
    number from 1 to 7, the program will keep prompting them for an
    input until it is valid.*/

    //Answer:
    public static void main(String[] args) {
        int number; //Integer variable holding the number value representing the day of the week.
        Scanner sc = new Scanner(System.in); //Scanner variable to take in input from user using the terminal.
        boolean bool = false; //Boolean variable to stop the program (stops the loop) once the user inputs the right number.

        while(!bool) {
            System.out.println("Enter number.");
            number = sc.nextInt();

            if(number <= 7) {
                switch(number) { //Outputs a certain day of the week depending on the value of the "number" variable.
                    case 1:
                        System.out.println("Monday");
                        break;

                    case 2:
                        System.out.println("Tuesday");
                        break;

                    case 3:
                        System.out.println("Wednesday");
                        break;

                    case 4:
                        System.out.println("Thursday");
                        break;

                    case 5:
                        System.out.println("Friday");
                        break;

                    case 6:
                        System.out.println("Saturday");
                        break;

                    case 7:
                        System.out.println("Sunday");
                        break;
                }
                bool = true;
            } else { //If the user inputs an invalid number, then the program prompts the user to try again and the program starts all over again.
                System.out.println("Invalid input. Try again.");
            }
        }
    }
}
