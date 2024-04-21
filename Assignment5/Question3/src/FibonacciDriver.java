/* Author: Caitlin Coulombe, T00756521
 * Date: April 20, 2024
 * Course: COMP 1131
 * Assignment 5 Question 3: a Fibonacci sequence can be defined as a set of numbers where each element is the sum of the previous 
 * two elements. The most basic sequency has the first and second numbers in the sequency being 1, i.e. 1, 1, 2, 3, 5, 8, 13, ...
 * 
 * Design and implement a recursive program tht produces up to the Nth Fibonacci number.
 * 
 * For the main driver, produce at least five sequences, including 1 and 2 as boundary tests.
 */

 import java.util.Scanner;

public class FibonacciDriver {
    public static void main(String[] args) throws Exception {
        // take a value in from the user for N 
        // call the static sequence and print the results

        // Variables
        int inputValue;

        final int FIRST_NUM = 1;    // I have chosen 1 as my first number; however, the Fibonacci sequence can be started at 0 or the logic can be applied to any starting value
        final int SECOND_NUM = 1;

        int value;
        String valueSuffix;

        Scanner scan = new Scanner(System.in);

        // prompt the user for the value they want to know
        System.out.print("Please enter a non-zero, positive integer value of the position in the Fibonacci sequence you want to know: ");

        inputValue = scan.nextInt();
        System.out.println();

        while(inputValue <= 0)
        {
            System.out.print("The value must be a whole number that is equal to or greater than 1: ");

            inputValue = scan.nextInt();
            System.out.println();
        }

        // call the static method to get the value from the sequence
        value = FibonacciSequence.fibSum(inputValue, FIRST_NUM, SECOND_NUM);
        
        // determining the proper suffix for N 
        valueSuffix = "";
        if(inputValue == 1)
        {
            valueSuffix = "st";
        }
        else if(inputValue == 2)
        {
            valueSuffix = "nd";
        }
        else if(inputValue == 3)
        {
            valueSuffix = "rd";
        }
        else
        {
            valueSuffix = "th";
        }

        // tell the user the Nth value
        System.out.println("The " + inputValue + valueSuffix + " value using the Fibonacci sequence is " + value);
    }
}
