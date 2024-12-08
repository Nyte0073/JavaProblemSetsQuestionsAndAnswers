package Basics;

public class Question3 {

    /*Take a String that contains a word for a single-digit, positive
    number. The program will then print out all single-digit,
    positive numbers lesser than or equal to the number represented by
    the String. If the String does not contain a word for a single-digit,
    positive number, then the program will print: “Invalid input.”*/

    //Answer
    public static void main(String[] args) {
        String number = "Five"; //String variable containing the word value of the single-digit, positive number.

        switch(number.toLowerCase()) { //Put the String variable into switch statement, which runs certain amounts of code depending on the value of the String variable.
            case "nine":
                System.out.println("Eight");

            case "eight":
                System.out.println("Seven");

            case "seven":
                System.out.println("Six");

            case "six":
                System.out.println("Five");

            case "five":
                System.out.println("Four");

            case "four":
                System.out.println("Three");

            case "three":
                System.out.println("Two");

            case "two":
                System.out.println("One");

            case "one":
                System.out.println("Zero");

            default:
                System.out.println("Invalid input."); //This is here so that if the user inputs the wrong value for the String, the console will output "Invalid input."
        }
    }
}
