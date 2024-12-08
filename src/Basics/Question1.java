package Basics;

public class Question1 {

    /*Create a program that determines if a number is less than 5,
    * between 5 and 10 inclusive, or greater than 10. Print the result to the console.*/

    /*Answer:*/
    public static void main(String[] args) {
        int number = 7; //Integer variable that carries the value of the number being used.

        if(number < 5) { //If the number is less than 5, the console will print "less than 5".
            System.out.println(number + " is less than 5.");
        } else if(number >= 5 && number <= 10) { //If the number is between 5 and 10, the console will print "between 5 and 10".
            System.out.println(number + " is between 5 and 10.");
        } else { //If the number is GREATER than 10, the console will print "greater than 10".
            System.out.println(number + " is greater than 10.");
        }
    }
}

