/* Author: Caitlin Coulombe, T00756521
 * Date: April 19, 2024
 * Course: COMP 1131
 * Assignment 5 Question 2: See DiceDriver for assignment details.
 */

 // Create a 1D array of size specified by the user which will store and use as many dice.
public class DiceSet {
    // construct a set using the desired number of dice from the user
    // roll the dice as many times as the user wants to roll them
    // return the values of each die

    // Class Variables
    Die[] diceSet;

    //--------------------------------------------------------------------------------------------------------------------
    // Constructor: creates as many dice as the user specified and stores them all in a 1D array
    //--------------------------------------------------------------------------------------------------------------------
    public DiceSet(int numOfDice)
    {
        diceSet = new Die[numOfDice];

        for(int i = 0; i < diceSet.length; i++)
        {
            diceSet[i] = new Die();
        }
    }

    //--------------------------------------------------------------------------------------------------------------------
    // rollSet: rolls the set of dice the number of times specified by the user and returns the results for each roll
    //--------------------------------------------------------------------------------------------------------------------
    public String rollSet(int rolls)
    {
        // options for this - I think I like the recursive idea better but I need to sleep so thats a problem for tomorrow ***** DELETE THIS!!
            // iterative: for 1 through N rolls, roll each die (i.e. double for loops or a for loop within a while loop)
            // recursive: if the number of rolls is not zero and is greater than 1, roll all of the dice (use the same kind of for loop as you would iteratively), then call rollSet(rolls - 1). If rolls = 1, roll but don't call method. if roll is 0, just return the default values
            return diceSet.toString();
    }
}
