/* Author: Caitlin Coulombe, T00756521
 * Date: April 3, 2024
 * Course: COMP 1131
 * Assignment 5 Question 1: See class ArrayDriver for more details on the assignment.
 * The constructor receives a parameter, which is the size of the array to be dynamically allocated in the constructor, 
 * then populates that array with random characters from the range 'a' through 'z' (done by the following lines of code)
 *      Random rnd = new Random();
 *      char c = (char) (' ' + rnd.nextInt(26));
 */
import java.util.Random;

public class ArrayOps {
    // take the size in from the driver and fill an array of that size with random chars
    // create a getter for the lowest and highest value of the array
    // create a toString to return the whole array

    // Class variables and objects
    char[] array;
    Random rand = new Random();

    // -----------------------------------------------------------------------------------------
    // Constructor: Create an array with the dimensions specified by the driver. Fill it with 
    // random characters
    // -----------------------------------------------------------------------------------------
    public ArrayOps(int inputSize)
    {
        array = new char[inputSize];

        for(int i = 0; i < array.length; i++)
        {
            char c = (char)('a' + rand.nextInt(26));
            array[i] = c;
        }
    }

    // -----------------------------------------------------------------------------------------
    // getLowest: get the lowest value within the array through iteration and return it to the main
    // -----------------------------------------------------------------------------------------
    public char getLowest()
    {
        char lowestChar = array[0]; // start with array[0] and iterate through all remaining characters to compare

        if(array.length == 1)
            return lowestChar;

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < lowestChar)
                lowestChar = array[i];
        }
        
        return lowestChar;
    }

    // -----------------------------------------------------------------------------------------
    // getHighest: get the highest value within the array through iteration and return it to the main
    // -----------------------------------------------------------------------------------------
    public char getHighest()
    {
        char highestChar = array[0]; // start with array[0] and iterate through all remaining characters to compare

        if(array.length == 1)
            return highestChar;

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > highestChar)
                highestChar = array[i];
        }
        
        return highestChar;
    }

    // -----------------------------------------------------------------------------------------
    // toString: return the entire array to the main
    // -----------------------------------------------------------------------------------------
    public String toString()
    {

        String arrayString = "{";

        for(int i = 0; i < array.length; i++)
        {
            arrayString += "\t" + array[i];
        }

        arrayString += "}";

        return arrayString;
    }
}
