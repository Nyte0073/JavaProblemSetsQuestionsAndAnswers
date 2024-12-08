package ExtraBasics;

public class Question3 {

    /*Take a single digit, positive number, and print out the word for
    that number. If the number is not single digit or positive, then the
    program will print: “Invalid input.”*/

    //Answer:
    public static void main(String[] args) {
        int number = 6; //Integer variable holding value for single-digit, positive number.

        switch(number) { //Output the word form of the number depending on its value.
            case 9:
                System.out.println("Nine");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 6:
                System.out.println("Six");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 1:
                System.out.println("One");
                break;

            default: //If the value of the number is not single-digit or positive, then the program will print "Invalid input."
                System.out.println("Invalid input.");
        }
    }
}
