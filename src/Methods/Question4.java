package Methods;

import java.util.HashMap;
import java.util.Scanner;

public class Question4 {

    /*Make a program that allows the user to create a quiz. The amount of
    questions on the quiz is determined by the user. The user will input the
    questions and answers. After that, the program will allow the user to
    take the quiz. The program will give the user immediate feedback on if
    the inputted answer is correct. Once the program ends the user will get
    their score.*/

    //Answer:

    public static void createQuiz() {
        Scanner sc = new Scanner(System.in); //Scanner variable for taking in user input.
        HashMap <String, String> questionsAndAnswers = new HashMap<>(); //HashMap variable for storing and mapping questions and answers.
        int score = 0; //Integer variable to keep track of the player's current score.

        System.out.println("Enter number of questions.");
        int numOfQuestions = sc.nextInt(); //Getting user input for the number of questions of the quiz.

        sc.nextLine(); //Filling in the empty read line that the nextInt() method won't take up.

        for (int i = 0; i < numOfQuestions; i++) { //Looping a certain amount of times, depending on the number of questions, to ask the user to input the questions and answers.
            System.out.println("Enter question " + (i+1) + ".");
            String question = sc.nextLine(); //Getting user input for the questions.

            System.out.println("Enter answer " + (i+1) + ".");
            String answer = sc.nextLine(); //Getting user input for the answers.

            questionsAndAnswers.put(question, answer); //Storing the questions and answers in the HashMap to retrieve them later and to map them together to determine whether the player is correct in their answers when they take the quiz.
        }

        System.out.println("Now you can take the quiz.");

        for(String string : questionsAndAnswers.keySet()) { //Loops through the HashMap to ask the user for their answers to the quiz's questions.
            System.out.println(string + "?");
            String answer = sc.nextLine(); //Taking input for the user answer's

            if(answer.equalsIgnoreCase(questionsAndAnswers.get(string))) { //If the user's answer is correct, then the console will print "Correct!" and augment the player's score.
                System.out.println("Correct!");
                score++;
            } else { //If the player's answer is not correct, then the console wil just print out "Incorrect."
                System.out.println("Incorrect.");
            }
        }

        System.out.println("Here is your score: " + Math.round((((float) score /numOfQuestions) * 100)) + "%"); //Outputs the player's final score to the console, in percentage.
    }

    public static void main(String[] args) {
        createQuiz(); //Referencing the method in the "main" method to make the program run.
    }
}
