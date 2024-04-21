/* Author: Caitlin Coulombe, T00756521
 * NOTE: Class is adapted from Listing 5.2, Chapter 5 Writing Classes in textbook: Lewis, J., DePasquale, P., & Chase, J. 
 * (2020). Java Foundations: Introduction to Program Design and Data Structures (5th ed.). Boston, MA: Pearson. ISBN: 
 * 978-0-13-520597-6
 *      Adaptations include: addition of the getFaceWord() method and changes to the representation of the results as 
 *      returned by the toString() method
 * 
 * Date: April 19, 2024
 * Course: COMP 1131
 * Assignment 5 Question 2: See DiceDriver for assignment details.
 */

 
// Die represents a single die with faces showing values between 1 and 6.
public class Die {

    final int MAX = 6;  // maximum face value

    int faceValue;  // the current value showing on the dice

    //--------------------------------------------------------------------------------------------------------------------
    // Constructor: sets the intial face value for this die.
    //--------------------------------------------------------------------------------------------------------------------
    public Die()
    {
        faceValue = 1;
    }

    //--------------------------------------------------------------------------------------------------------------------
    // roll: computes a new face value for this die and returns the result.
    //--------------------------------------------------------------------------------------------------------------------
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }
    
    //--------------------------------------------------------------------------------------------------------------------
    // setFaceValue() mutator which will set the face value (if and only if the entered value is valid)
    //--------------------------------------------------------------------------------------------------------------------
    public void setFaceValue(int value)
    {
        if(value < 0 && value <= MAX)
            faceValue = value;
    }

    //--------------------------------------------------------------------------------------------------------------------
    // getFaceValue: accessor which returns the numerical value of the die
    //--------------------------------------------------------------------------------------------------------------------
    public int getFaceValue()
    {
        return faceValue;
    }

    //--------------------------------------------------------------------------------------------------------------------
    // getFaceWord: returns the textual representation of the die, only to be called by the object itself
    //--------------------------------------------------------------------------------------------------------------------
    private String getFaceWord()
    {
        final String[] TEXT_NUMS = {"One", "Two", "Three", "Four", "Five", "Six"};

        return TEXT_NUMS[faceValue - 1];
    }

    //--------------------------------------------------------------------------------------------------------------------
    // toString: returns the string representation of the current face value of the die
    //--------------------------------------------------------------------------------------------------------------------
    public String toString()
    {
        String result = faceValue + " : " + getFaceWord();

        return result;
    }
}
