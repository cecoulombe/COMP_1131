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
    Die[] theDice;

    //--------------------------------------------------------------------------------------------------------------------
    // Constructor: creates as many dice as the user specified and stores them all in a 1D array, minimum 1 (if numOfDice
    // is less than 1, change it to be 1 as that is the minimum)
    //--------------------------------------------------------------------------------------------------------------------
    public DiceSet(int numOfDice)
    {
        theDice = new Die[numOfDice];

        if(numOfDice < 1)
        {
            numOfDice = 1;
        }

        for(int i = 0; i < theDice.length; i++)
        {
            theDice[i] = new Die();
        }
    }

    //--------------------------------------------------------------------------------------------------------------------
    // rollSet: rolls the set of dice the number of times specified by the user and returns the results for each roll
    //--------------------------------------------------------------------------------------------------------------------
    public String rollSet(int rolls)
    {
        String results = "";
        // iterative solution: for i++ until i = rolls, store the roll value for each die in the set and returns them one at a time
        if(rolls > 0) 
        {
            for(int i = 1; i <= rolls; i++)
            {
                results += "\nRoll " + (i) + " = ";
                for(Die die : theDice)
                {
                    die.roll();
                    results += die.toString() + ", ";
                }
                
            }
            return results;
        }   
        else
        {
            return theDice.toString();
        }
    }
}
