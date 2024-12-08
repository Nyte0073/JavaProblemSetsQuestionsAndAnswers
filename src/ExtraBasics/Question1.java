package ExtraBasics;

public class Question1 {

    /*Create a program that checks if a number is divisible by 7 and 4.
    Return the result to the console.*/

    //Answer:
    public static void main(String[] args) {
        int number = 28; //Integer variable containing the value of the number being checked.

        if(number % 7 == 0 && number % 4 == 0) { //If the number is divisible by 7 and 4, then the console will print "divisible by 7 and 4."
            System.out.println(number + " is divisible by 7 and 4.");
        } else if(number % 7 == 0) { //If the number is only divisible by 7, then the console will print "only divisible by 7."
            System.out.println(number + " is only divisible by 7.");
        } else if(number % 4 == 0) { //If the number is only divisible by 4, then the console will print "only divisible by 4."
            System.out.println(number + " is only divisible by 4.");
        } else { //If the number isn't divisible by 4 or 7, then the console will print "isn't divisible by 4 or 7."
            System.out.println(number + " isn't divisible by 4 or 7.");
        }
    }
}
