package Methods;

public class Question1 {

    /*Make a program that uses methods to add, subtract, multiply and
    divide two numbers that are provided by a user.*/
    
    //Answer:
    
    public static void add(double num1, double num2) { //Method to add the two number parameters.
        System.out.println("Sum: " + (num1 + num2));
    }
    
    public static void subtract(double num1, double num2) { //Method to subtract the two number parameters.
        System.out.println("Difference: " + (num1 - num2));
    }
    
    public static void multiply(double num1, double num2) { //Method to multiply the two number parameters.
        System.out.println("Product: " + (num1 * num2));
    }
    
    public static void divide(double num1, double num2) { //Method to divide the two number parameters.
        System.out.println("Quotient: " + (num1/num2));
    }

    public static void main(String[] args) {
        double num1 = 6; //First number.
        double num2 = 2; //Second number.

        add(num1, num2); //Referencing all the methods one by one with the two same numbers as their parameters.
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }
}
