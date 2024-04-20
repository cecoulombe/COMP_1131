/* Author: Caitlin Coulombe, T00756521
 * Date: April 19, 2024
 * Course: COMP 1131
 * Assignment 5 Question 1: As described in the textbook, an array is often used as a grouping structure for a set of related data items. 
 * Common operations on an array of character values are to find the lowest value and the highest value. To demonstrate these operations, 
 * design and implement a class called ArrayOps, which has a character array. The constructor receives a parameter, which is the size of 
 * the array to be dynamically allocated in the constructor, then populates that array with random characters from the range 'a' through 
 * 'z' (done by the following lines of code)
 *      Random rnd = new Random();
 *      char c = (char) (' ' + rnd.nextInt(26));
 * Methods are required that return the lowest value and highest value, as well as a String representation of the array values. Document 
 * your design with a UML class diagram that is to be submitted along with the testing exhibits. Creare a separate driver class that 
 * prompts the user for the sample size, then instantiates a ArrayOps object of that size and outputs its contents and the lowest and highest 
 * values.
 *      Testing: Include the output for at least five (5) different test runs of various sizes, that shows the array contents along with its 
 *      highest and lowest values. Make sure that you manually check the results.
 */

import java.util.Scanner;

public class ArrayDriver {
    public static void main(String[] args) throws Exception {
        // ask the user for the size of the array (1D)
        // instantiate a new array of that size
        // get and print the lowest and highest value of the array
        // print the whole array

        // Variables
        int inputSize;

        // Objects
        ArrayOps array;
        Scanner scan = new Scanner(System.in);

        // Take input from the user for the size of the array
        System.out.println();
        System.out.print("Please enter a non-zero integer for the size of the array (note that non-integers will result in an error) ");
        inputSize = scan.nextInt();
        System.out.println();

        // Instantiate the new array of that size
        array = new ArrayOps(inputSize);

        // get the lowest and highest character in the array
        char lowestChar = array.getLowest();
        char highestChar = array.getHighest();

        System.out.println("The lowest value in the array is \"" + lowestChar + "\" and the highest value is \"" + highestChar + "\"");

        // Print the entire array:
        System.out.println("The whole array is: " + "\n" + array);
    
        scan.close();
    }
}
