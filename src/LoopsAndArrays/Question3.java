package LoopsAndArrays;

public class Question3 {

    /*Write a program that generates this image:
    !
    !!
    !!!
    !!!!
    !!!!!
    !!!!!!
    !!!!!!!
    !!!!!!!!
    !!!!!!!!!
    !!!!!!!!!!
    */

    //Answer:
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); //StringBuilder variable to add more "!"s to itself every time the loop runs.
        for (int i = 0; i < 10; i++) { //Adds an "!" to the StringBuilder String variable every loop iteration and then outputs the updated String to the console.
            builder.append("!"); //Update the value of the String in the StringBuilder with "!".
            System.out.println(builder);
        }
    }
}
