package LoopsAndArrays;

public class Question1 {

    /*Create a program that determines the lowest number in an integer
    array.*/

    //Answer:
    public static void main(String[] args) {
        int[] numbers = {10, 58, 68, 3, 46}; //Integer array carrying the numbers to be searched through.

        int smallestNumber = numbers[0]; //Integer variable to hold the value for the smallest number in the array.

        for (int i = 0; i < numbers.length; i++) { //For-loop to loop through each element in the array, and to update the smallestNumber variable with the new smallest number it finds.
            if(numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }

        System.out.println("This is the lowest number in the array: " + smallestNumber); //Output the smallest number in the array to the console.
    }
}
