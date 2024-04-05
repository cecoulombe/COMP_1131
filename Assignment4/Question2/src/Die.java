/* Author: Caitlin Coulombe, T00756521
 * Date: April 4, 2024
 * Course: COMP 1131
 * Assignment 4 Question 1: Modify the Die class so that it can be used to simulate any of the five possible regular dice. The class 
 * requires the following methods and/or modifications:
 *      * A constructor with no parameters that creates a default 6-sided die
 *      * A consturctor with one parameter that indicates how many faces the die is to have. Check that it is one of the permitted 
 *      values, otherwise default to a 6-sided die.
 *      * The roll() method given needs to be modified to work within the number of faces established by the constructors.
 *      * The setFaceValue() method needs to have logic added to ensure the new incoming face value is within the allowable limits 
 *      for the number of faces.
 *      * A second get_ method that retrieves the textual name of the current face value, such as One, Two, Thre, &c. Note that a 
 *      single method i expected that will work with any of the five regular dice.
 *      * The toString() method should return both the numeric value and textual name for the current face value in a form like "1 : 
 *      One".
 */

 import java.util.Random;

public class Die {
    // default constructor
    // 1 parameter constructor
    // roll method that works with any number of dice
    // setFaceValue that makes sure its between the allowable face values for that dice
    // get_ method that returns number
    // get_ method that returns text
    // toString that returns num : text

    // Class variables
    int maxNumOfFaces;

    int faceValue;

    final int DEFAULT = 6;

    // Random object
    Random rand = new Random();

    //---------------------------------------------------------------------------------------------------------------------
    // Die() creates a default six sided dice
    //---------------------------------------------------------------------------------------------------------------------
    public Die()
    {
        maxNumOfFaces = DEFAULT;
    }

    //---------------------------------------------------------------------------------------------------------------------
    // Die() creates a die with the specified number of faces
    //---------------------------------------------------------------------------------------------------------------------
    public Die(int userInputFaces)
    {
        if(userInputFaces == 4 || userInputFaces == 6 || userInputFaces == 8 || userInputFaces == 12 || userInputFaces == 20)
        {
            maxNumOfFaces = userInputFaces;
        }
        else
        {
            maxNumOfFaces = DEFAULT;
        }
    }

    //---------------------------------------------------------------------------------------------------------------------
    // getMaxFace() tells the user how many faces there are on the chosen die
    //---------------------------------------------------------------------------------------------------------------------
    public int getMaxFace()
    {
        return maxNumOfFaces;
    }

    //---------------------------------------------------------------------------------------------------------------------
    // getCurrentFaceNum() returns the number that is currently displayed on the face
    //---------------------------------------------------------------------------------------------------------------------
    public int getCurrentFaceNum()
    {
        return faceValue;
    }

    //---------------------------------------------------------------------------------------------------------------------
    // getCurrentFaceStr() returns the number that is currently displayed on the face as a written word
    //---------------------------------------------------------------------------------------------------------------------
    public String getCurrentFaceStr()
    {
        final String[] numNames = {
            "One", 
            "Two", 
            "Three", 
            "Four", 
            "Five", 
            "Six", 
            "Seven", 
            "Eight", 
            "Nine", 
            "Ten", 
            "Eleven", 
            "Twelve", 
            "Thirteen", 
            "Fourteen", 
            "Fifteen", 
            "Sixteen", 
            "Seventeen", 
            "Eighteen", 
            "Nineteen", 
            "Twenty"
        };

        return numNames[faceValue - 1];
    }

    //---------------------------------------------------------------------------------------------------------------------
    // setFaceValue() sets the face value as the value input by the user
    //---------------------------------------------------------------------------------------------------------------------
    public void setFaceValue(int userInput)
    {
        if(userInput > 0 && userInput <= maxNumOfFaces)
        {
            faceValue = userInput;
        }
    }

    //---------------------------------------------------------------------------------------------------------------------
    // roll() rolls a random face of the die determined from the size of the die chosen on instantiation and returns to the 
    // driver
    //---------------------------------------------------------------------------------------------------------------------
    public int roll()
    {
        faceValue = rand.nextInt(maxNumOfFaces) + 1;

        return faceValue;
    }

    //---------------------------------------------------------------------------------------------------------------------
    // toString() returns the current face value in the num : Str format
    //---------------------------------------------------------------------------------------------------------------------
    public String toString()
    {
        return getCurrentFaceNum() + " : " + getCurrentFaceStr();
    }
}
