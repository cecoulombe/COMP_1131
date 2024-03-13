/* Author: Caitlin Coulombe, T00756521
 * Date: March 12, 2024
 * Course: COMP 1131
 * Assignment 2 Question 2: Write an applicatino that prompts for and obtains a value representing a whole number of millimetres, 
 * then displays the equivalent amount of length as a combinatino of metres, centimetres, and milllimetres. Note: a metre is 100 
 * centimetre or 1000 millimetres.
 *      Testing: Submit testing exhibits using the following inputs: 0, 1, 10, 1000, 1011, and 6789. You may add further inputs
 *      if you wish
 */

 import java.util.Scanner;

public class LengthExpression {
    // Convert the whole number of millimetres so that is is represented as a number of metres, centimetres, and millimetres.
    // 1 metre = 100 centimetres = 1000 millimetres.
    public static void main(String[] args) {
        // get input from the user and make sure it is an int
        // convert that into the number of metres and save the remainder
        // repeat for centimetres
        // repeat for millimetres
        // make sure there is nothing left at that point and print the result

        // Variables
        final int metreFactor = 1000;   // there are 1000 mm in a metre
        final int centimetreFactor = 10;    // there are 10 mm in a centimetre

        int inputMillimetres;
        int outputMetres;
        int remainderM;
        int outputCentimetres;
        int remainderCM;
        int outputMillimetres;
        

        // Initialize the scanner so that it reads input from the keyboard
        Scanner scan = new Scanner(System.in);

        // ask the user for input
        System.out.println("Enter a whole number of millimetres. (Note: fractional numbers will result in an error.)");

        // read the input from the scanner
            // scanning for ints to make sure not to take in any floats or strings
        inputMillimetres = scan.nextInt();

        // convert the input to number of metres
        remainderM = inputMillimetres % metreFactor;
        outputMetres = (inputMillimetres - remainderM) / metreFactor;

        // convert the remainder to number of centimetres
        remainderCM = remainderM % centimetreFactor;
        outputCentimetres = (remainderM - remainderCM) / centimetreFactor;

        // the remainder at this point is equal to the number of millimetres
        outputMillimetres = remainderCM;

        // print the results to the terminal
        System.out.println( inputMillimetres + " is equal to " + outputMetres + " metres, " + outputCentimetres + " centimetres, and " 
            + outputMillimetres + " millimetres.");
    }
}
