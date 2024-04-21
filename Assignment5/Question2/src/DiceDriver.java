/* Author: Caitlin Coulombe, T00756521
 * Date: April 19, 2024
 * Course: COMP 1131
 * Assignment 5 Question 2: The Die class given in Listin 5-2 of Chapter 5 is to be used for the basis of this project. 
 * Complete this design so that the toString() method return includes a textual representation as well as the number, 
 * e.g. "1 : One" instead of just 1. This logic should use an array to provide a lookup of the appropriate text name. 
 * 
 * Use this completed class to design and implement a class called DiceSet that simulates a set of multiple dice. The 
 * design should store i to N objects of the Die class using a one-dimensional array. The constructor should dynamically 
 * allocate the number of dice needed based on a parameter. Include a method to roll all the dice in the set and a 
 * toString to show the contents of the set. Document your design with a UML Class diagram, that is to be submitted along 
 * with the testing exhibits. 
 *      Testing: Create a separate driver class that creates several different size sets, including 1, 2, and 5. Then 
 *      output the results of 10 rolls of each set.
 */

 import java.util.Scanner;
public class DiceDriver {
    public static void main(String[] args) throws Exception {
        // create a diceSet with the specified number of dice in the set.
        // ask the user how many times they want to roll the dice and print the results for each time

        // Variables
        int inputNumOfDice;
        int inputNumOfRolls;

        String diceResults = "";

        Scanner scan = new Scanner(System.in);

        // ask the user for the size of the dice set and check that it is a valid input
        System.out.print("Please enter a non-zero, positive integer to represent the number of dice in the set: ");
        inputNumOfDice = scan.nextInt();
        System.out.println();

        while(inputNumOfDice <= 0)
        {
            System.out.println("Please enter a non-zero, positive integer:");
            inputNumOfDice = scan.nextInt();
        }

        // instantiate the set of dice
        DiceSet dice = new DiceSet(inputNumOfDice);

        // ask the user for the number of times to roll the set
        System.out.print("Please enter a positive integer to represent the number of times you want to roll the set: ");
        inputNumOfRolls = scan.nextInt();
        System.out.println();

        while(inputNumOfRolls < 0)
        {
            System.out.println("Please enter a positive integer:");
            inputNumOfRolls = scan.nextInt();
        }

        scan.close();

        // roll the dice set and print the results
        diceResults = dice.rollSet(inputNumOfRolls);

        System.out.println("The set of " + inputNumOfDice + " dice was rolled a total of " + inputNumOfRolls + " times: \n" + diceResults);

    }
}
