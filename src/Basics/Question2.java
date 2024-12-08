package Basics;

public class Question2 {

    /*Calculate the area of a circle given a variable
    * representing the circle's radius. The formula for the area of a circle is: PI x radius squared*/

    //Answer
    public static void main(String[] args) {
        double radius = 20.5; //Double variable carrying the value for the circle's radius.

        double area = Math.PI * Math.pow(radius, 2); //You can use the constant Math.PI to represent PI and Math.pow(value, 2) method get the radius squared.

        System.out.println("Area of the circle: " + area); //Outputting the area of the circle to the console.
    }
}
