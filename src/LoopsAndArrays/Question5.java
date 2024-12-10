package LoopsAndArrays;

import java.util.Scanner;

public class Question5 {

    /*Prompt the user for a beginning hour, whether it is in the morning
    or afternoon (am or pm), and the number of elapsed hours since the
    beginning hour. The application then displays the time after that
    many hours have passed.*/

    //Answer:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner variable for taking in user input.

        System.out.println("Enter beginning hour."); //Taking in user input for the starting hour.
        double beginningHour = sc.nextDouble();

        System.out.println("Enter elapsed time."); //Taking in user input for the elapsed amount of time.
        double elapsedTime = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter am or pm."); //Taking in user input for the time of day it is.
        String timeOfDay = sc.nextLine();

        if(timeOfDay.equalsIgnoreCase("am")) { //If timeOfDay is equal to am, then the program will print the time with AM if the number is less than 13.
            System.out.println(beginningHour + elapsedTime >= 13 ? (beginningHour + elapsedTime) - 12 + " pm" : beginningHour + elapsedTime + " am");
        } else { //If timeOfDay is equal to pm, then the program will print the time of the day with PM if the number is less than 13.
            System.out.println(beginningHour + elapsedTime >= 13 ? (beginningHour + elapsedTime) - 12 + " am" : beginningHour + elapsedTime - 12 + " pm");
        }

        sc.close();
    }
}
