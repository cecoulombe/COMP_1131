/* Author: Caitlin Coulombe, T00756521
 * Date: March 12, 2024
 * Course: COMP 1131
 * Assignment 2 Question 3: Write an application that separately prompts for and obtains two non-zero integer values. 
 * Calculate and display the two decimal quotients, i.e., number1/number2 and number2/number1
 *      Testing: Submit testing exhibits using the following inputs: 1, 1; 1, 4; 3, 8; 2, 3; and 25, 7. You mad add
 *      further inputs if you wish.
 */

 import java.util.Scanner;

public class InputDivider {
    public static void main(String[] args) {
        // get input from the user for one number
        // get input from the user for another number
        // divide them 
        // switch order and divide them again
        // print the results

        // Variables
        int inputNumber1;
        int inputNumber2;

        double quotient1Over2;
        double quotient2Over1;

        Scanner scan = new Scanner(System.in);

        // Ask the user for the first number
        System.out.println("Please enter a whole, non-zero number. Note: fractional numbers will result in an error.");

        inputNumber1 = scan.nextInt();

        if(inputNumber1 == 0)
        {
            System.out.println("Zero is not a valid number, please enter a non-zero integer.");
            inputNumber1 = scan.nextInt();
        }

        // Ask the user for the second number
        System.out.println("Please enter another whole, non-zero number.");

        inputNumber2 = scan.nextInt();

        if(inputNumber2 == 0)
        {
            System.out.println("Zero is not a valid number, please enter a non-zero integer.");
            inputNumber2 = scan.nextInt();
        }

        // divide number 1 by number 2
        quotient1Over2 = (double) inputNumber1 / (double) inputNumber2;

        // divide number 2 by number 1
        quotient2Over1 = (double) inputNumber2 / (double) inputNumber1;

        // print the two quotients to the terminal
        System.out.println(inputNumber1 + " divided by " + inputNumber2 + " is equal to " + quotient1Over2 + ".");
        System.out.println(inputNumber2 + " divided by " + inputNumber1 + " is equal to " + quotient2Over1 + ".");
    }
}
