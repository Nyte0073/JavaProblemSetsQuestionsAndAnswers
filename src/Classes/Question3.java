package Classes;

public class Question3 {

    /*Create your own Power class that takes two integer parameters
    in its constructor. Once the powerOf() method is called, the method
    will return the value of the first input raised to the power of the second.
    You’re essentially reproducing the Math.pow() method. Show
    the usage of theis object in a different class.*/

}

//Answer

class Power { //Clas Power to store the variable for the exponent and base numbers and the method to return the power between those two numbers.

    int exponent; //The exponent in the equation.
    int base; //The base in the equation.

    public Power(int exponent, int base) { //Power constructor to make sure that every Power object comes with its own Integer exponent and base.
        this.exponent = exponent;
        this.base = base;
    }

    public void powerOf() { //Creates a loop to make base multiply itself by itself a certain amount of times depending on the exponent.
        int sum = 1;
        for (int i = 0; i < exponent; i++) {
           sum *= base;
        }
        System.out.println("Power: " + sum);
    }
}

class PowerDemo { //Example demo class to instantiate a Power clas object.
    public static void main(String[] args) {
        Power power = new Power(2, 3); //Created a Power object initialized with the exponent 2 and he base as 3.
        power.powerOf(); //Calling the powerOf() method to return the power between the two numbers.
    }
}
