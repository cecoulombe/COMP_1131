/* Author: Caitlin Coulombe, T00756521
 * Date: March 18, 2024
 * Course: COMP 1131
 * Assignment 2 Question 2: The area of a triangle can be caucluated using Heron's formula, whjich uses the length of the
 *  three sides a, b, and c and the semi-perimiter s. Write an application that reads the values for a, b, and c, then 
 * determines and displays the areas. Prompt for each of the three values individually.
 *      Testing: Include text exhibits for the following sets of inputs:
 *          0, 0, 0 = 0.0
 *          3, 4, 5 = 6.0
 *          1, 1, 1 = 0.433 ...
 *          4, 7, 9 = 13.416 ...
 */

 import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        // prompt for all three values (does not specific integer or otherwise)
        // compute the semi perimeter
        // compute the area
        // print the area of the triange (try to use the formatting from the chapter and see how you like it)

        // Variables
        double inputA;
        double inputB;
        double inputC;

        double semiPerimeter;

        double areaSquared;
        double area;

        Scanner scan = new Scanner(System.in);

        // prompt the user for the three values
        System.out.println("Please enter a number for the length of side A. (note: alphabet characters will result in an error)");

        inputA = scan.nextDouble();

        System.out.println("Please enter another number for the length of side B.");

        inputB = scan.nextDouble();

        System.out.println("Please enter a final number for the length of side C.");

        inputC = scan.nextDouble();

        scan.close();

        // compute the semi perimeter (sum of sides divided by two)
        semiPerimeter = (inputA + inputB + inputC) / 2.0;


        // compute the area (square root of (s(s-a)(s-b)(s-c)))
        areaSquared = semiPerimeter * (semiPerimeter - inputA) * (semiPerimeter - inputB) * (semiPerimeter - inputC);

        area = Math.sqrt(areaSquared);

        // print the area
        System.out.println("The area of a triangle with side A = " + inputA + ", side B = " + inputB + ", and side C = " + inputC + ", is equal to " + area + ".");
    }
}
