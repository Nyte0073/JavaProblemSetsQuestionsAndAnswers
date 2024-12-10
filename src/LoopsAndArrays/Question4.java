package LoopsAndArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {

    /*Calculate all prime numbers up to a certain integer that the user
    will input. Recall that to test whether a number is prime, you must
    check that it cannot divide into any number below it, excluding 1.

    Extra points will be awarded for if you can use these
    two mathematical properties of numbers to make your program more
    efficient:

    • That all numbers can be written as the product of prime factors.

    • That the factors of a number are symmetrical about its square
    root. That is, if you know a number has a factor less than
    its square root, there must be a corresponding factor that is
    greater than its square root.*/

    //Answer:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner variable for taking in user input.
        ArrayList <Integer> primeNumbers = new ArrayList<>(); //ArrayList variable for taking in the numbers that are proven prime.

        System.out.println("Enter number.");
        int number = sc.nextInt(); //Getting user input from Scanner and storing value in number variable.

        int currentNumber; //The number currently being tested to see if it's prime.
        boolean prime; //Variable containing value of whether currentNumber is currently prime or not.

        for (int i = 2; i < number; i++) { //Loop through the numbers from 0 to the number inputted by the user to see which numbers are prime.
            currentNumber = i; //Updating currentNumber with the new number to be tested for "prime" trait.
            prime = true;
            for (int j = 2; j * j <= currentNumber; j++) { //Loops through the numbers less than the square root of currentNumber, to see if it has any factors other than itself and 1.
                if(currentNumber % j == 0) { //If the remainder of one number and currentNumber is 0, that means currentNumber isn't prime.
                    prime = false;
                    break;
                }
            }
            if(prime) { //If the number contained in currentNumber is prime, then the ArrayList primeNumbers adds the value of currentNumber to itself for storage.
                primeNumbers.add(currentNumber);
            }
        }

        System.out.println("Here are the prime numbers up to " + number + ": " + "\n" + primeNumbers); //Outputs all prime numbers stored in the primeNumbers ArrayList.

        sc.close();
    }
}
