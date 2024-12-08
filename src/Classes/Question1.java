package Classes;

public class Question1 {

    /*Create a class called Circle that programmers will be able to use
    to make circles in future programs. Each circle should have a radius
    and colour. The user should be able to call the functions getRadius(),
    getColour(), getDiameter(), getCircumference(), getArea(),
    and setColour(). Demonstrate the instantiation of two Circle objects in
    a different class that uses all three functions.*/
}

//Answer:

class Circle { //Created class Circle to hold all the methods and variable necessary for each circle created.
    double radius; //Holds the value for each circle's radius.
    String color; //Holds the value for each circle's color.

    public Circle(double radius, String color) { //Constructor for the Circle class to make sure that every circle object must be created an implanted radius and color.
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() { //The radius of the circle.
        return radius;
    }

    public String getColor() { //Get the color of the circle.
        return color;
    }

    public double getDiameter() { //Get the diameter of the circle.
        return radius * 2;
    }

    public double getCircumference() { //Get the circumference of the circle.
        return (Math.PI * 2) * radius;
    }

    public double getArea() { //Get the area of the circle.
        return Math.PI * Math.pow(radius, 2);
    }

    public void setColor(String color) { //Set the color of the circle to a new color.
        this.color = color;
    }
}

class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(45.6, "RED"); //Circle variable created here, and initialized with its radius being 45.6 and its color being "RED".

        System.out.println("Circle1 radius: " + circle1.getRadius()); //Outputting the circle's radius to the console.
        System.out.println("Circle1 diameter: " + circle1.getDiameter()); //Outputting the circle's diameter to the console.
        System.out.println("Circle1 color: " + circle1.getColor()); //Outputting the circle's color to the console.

        System.out.println("Circle1 circumference: " + circle1.getCircumference()); //Outputting the circle's circumference to the console.
        System.out.println("Circle1 area: " + circle1.getArea()); //Outputting the circle's area to the console.

        circle1.setColor("BLUE"); //Changing/setting the circle's color from "RED" to "BLUE".
    }
}
