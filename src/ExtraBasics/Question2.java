package ExtraBasics;

public class Question2 {

    /*Calculate the volume of a sphere given a variable representing
    the circle’s radius. The formula for the volume of a sphere is: (4/3) x PI x radius cubed*/

    //Answer:
    public static void main(String[] args) {
        double radius = 50.586; //Integer variable representing the circle's radius.

        double area = 4.0 / 3 * (Math.PI * Math.pow(radius, 3)); //The calculated area of the sphere applying the formula and the radius variable.

        System.out.println("Area of the sphere: " + area); //Printing the result of the sphere's area to the console.
    }
}
