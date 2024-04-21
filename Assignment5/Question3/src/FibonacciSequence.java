/* Author: Caitlin Coulombe, T00756521
 * Date: April 20, 2024
 * Course: COMP 1131
 * Assignment 5 Question 5: See FibonacciDriver for assignment details.
 */

// The Fibonacci sequence is a sequency of numbers where one number is the sum of the two numbers prior to it in the sequence.
// Recursion will be used to determine the Nth number in the sequence, where N is determined by the driver.
public class FibonacciSequence {
    // create a recursive algorithm for the fibonnaci sequence 
    // n_5 = (n_4) + (n_3)
    // n_4 = (n_3) + (n_1)
    // n_3 = (n_2) + (n_1)
    
    //-------------------------------------------------------------------------------------------------------------------------
    //fibSum: recursively determines the target value per the logic in the algorithm above.
    //-------------------------------------------------------------------------------------------------------------------------
    public static int fibSum(int targetValue, int num1, int num2)
    {
        //pass add num 1 and num 2, then pass num 2 as num1 and sum as num2 until the counter hits zero
        if(targetValue == 1)
        {
            return num1;
        }
        else
        {
            return fibSum(targetValue - 1, num2, (num1 + num2));
        }
    }

}
