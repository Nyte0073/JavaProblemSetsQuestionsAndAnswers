package Methods;

public class Question3 {

    /*Make a program that uses methods to determine a circles:
    ● Diameter (2r)
    ● Circumference (2πr)
    ● Area (πr )
    2

    When the user gives the radius of a circle.*/

    //Answer:

    public static void getDiameter(double radius) { //Method for getting the diameter of the circle.
        double diameter = 2 * radius;
        System.out.println("Diameter: " + diameter);
    }

    public static void getCircumference(double radius) { //Method for getting the circumference of the circle.
        double circumference = (Math.PI * 2) * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void getArea(double radius) { //Method for getting the area of the circle.
        double area = Math.PI * (Math.pow(radius, 2));
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        double radius = 67.485; //Decimal number representing the radius of the circle.

        getArea(radius); //Referencing all the methods in "main" method to run their programs.
        getCircumference(radius);
        getDiameter(radius);
        //This is a new change
    }
}
