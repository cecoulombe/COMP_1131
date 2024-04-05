/* Author: Caitlin Coulombe, T00756521
 * Date: April 4, 2024
 * Course: COMP 1131
 * Assignment 4 Question 1: The Die class presented in Listing 5.2 of the textbook models a standard cubic die with faces 1 through 6. 
 * It is also possible to have regular dice with 4 sides (tetrahedron), 8 sides (octahedron), 12 sides (dodecahedron), and 20 sides 
 * (icosahedron).
 * 
 * For your design, create a UML Class diagram similar to Figure 5.5 on page 180 of the textbook. Note that you need to include the 
 * constructors in the methods section.
 * 
 *      Testing: Write a test driver that exercises this class as follows: 
 *          * Instantiates a 6-sided die using the default constructor, then outputs the result of 12 rolls.
 *          * Create one of each of the five regular dice using the second constructor. For each, output the results from number of 
 *          rolls that is double the number of faces created
 *          * Attempt to create a die with an illegal number of faces then output the results of 10 rolls.
 * 
 */

import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) throws Exception {
        // take user input to decide if they want a default or specified number of faces
        // roll the dice 2x times
        // format the output so that its pretty

        // Variables
        int userInput;

        String another = "y";


        // Instantiate scanner
        Scanner scan = new Scanner(System.in);

        // make sure the user wants to roll another die
        while(another.equalsIgnoreCase("y"))
        {
            // take input from the user to decide what size dice to roll
            System.out.println("How many faces do you want the dice to have? Enter \"0\" for a default 6-faced dice, or enter an integer number of faces.");
            System.out.println("Note that the dice must be a regular 4, 6, 8, 12, or 20, otherwise it will result in the 6-sized default.");

            userInput = scan.nextInt();

            Die dice = null;

            if(userInput == 0)
            {
                dice = new Die();
            }
            else
            {
                dice = new Die(userInput);
            }

            // Testing the die methods
            // int diceRoll = dice.roll();
            // System.out.println(diceRoll);

            // dice.setFaceValue(3);
            // int dieNum = dice.getCurrentFaceNum();
            // System.out.println("The current face num is: "  + dieNum + " or " + dice.getCurrentFaceStr());


            // the the die 2 * numOfFaces times and report the results for each using a formatted toString output
            for(int i = 0; i < dice.getMaxFace() * 2; i++)
            {
                dice.roll();
                System.out.println(dice);
            }

            System.out.println("Do you want to roll another die? (y/n)");
            another = scan.next();
        }
        System.out.println("App end.");
    }
}
