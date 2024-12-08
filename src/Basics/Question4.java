package Basics;

public class Question4 {

    /*Write a program that determines if an array contains one, both,
or neither of two integers. Print out how many of the two integers
are in the array, as well as their indices if possible.*/
    
    //Answer
    public static void main(String[] args) {
        int[] numbers = {4, 7, 9, 0}; //Integer array for holding the collection of numbers.
        
        int firstNum = 6; //First number to find in the array,
        int secondNum = 4; //Second number to find in the array.

        boolean hasFirstNum = false; //Boolean containing the value of whether the array contains the first number.
        boolean hasSecondNum = false; //Boolean containing the value of whether the array contains the second number.

        for (int i = 0; i < numbers.length; i++) { //For-loop to access each element in the array and check if the array contains either of the two numbers.
            if(numbers[i] == firstNum) { //If the array contains the first number, the boolean hasFirstNum wil be set to true.
                hasFirstNum = true;
            }
            if(numbers[i] == secondNum) { //If the array contains the second number, the boolean hasSecondNum will be set to true.
                hasSecondNum = true;
            }
        }

        if(hasFirstNum && hasSecondNum) { //If the array contains both numbers (if hasFirstNum and hasSecondNum are both equal to true), then the console will print "array contains both numbers".
            System.out.println("The array contains both numbers.");
        } else if(hasFirstNum) { //If the array only contains the first number (only hasFirstNum is equal to true), then the console will print "only contains the first number."
            System.out.println("The array only contains the first number.");
        } else if(hasSecondNum) { //If the array only contains the second number (only hasSecondNum is equal to true), then the console will print "only contains second number."
            System.out.println("The array only contains the second number.");
        } else { //If the array doesn't contain any of the two numbers (both hasFirstNum and hasSecondNum are equal to false), then the console will print "doesn't contain either of the two numbers."
            System.out.println("The array doesn't contain either of the two numbers.");
        }
    }
}
