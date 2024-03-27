/* Author: Caitlin Coulombe, T00756521
 * Date: March 26, 2024
 * Course: COMP 1131
 * Assignment 3 Question 2: Design and implement an application that repeatedly reads some text from the user, then determines 
 * and displays how many of each of the five vowels (i.e. a, e, i, o, u) appear in the entire text. Have a separate counter 
 * for each vowel. Also count and print the number of non-vowel characters. The app should handle both lowercase and uppercase 
 * vowels. The logic MUST include a switch-case structure to determine which counter to increment. After the results for an 
 * input are displayed, prompt the user if they want to do another input.
 *      Hint: Use the charAt method of the string class to examine each character of the input
 *      Testing: Build a test plan separately so you can predict and show that ypur program is working correctly. You need to 
 *          determine a selection of inpits that demonstrates that each counter is functioning independently of the others. For 
 *          example: a set of words with only the vowel "a" such as "bat a ball" or a string of characters with no vowels such 
 *          as "R2D2!@#$".
 * 
 */

 import java.util.Scanner;

public class VowelCounting {
    public static void main(String[] args) {
        // make sure the user wants to do another round (while loop)
        // take in a phrase
        // for each letter in the phrase, see what the letter is an match it to a case for each vowel
        // each case will have a counter for that specific vowel and the default will count the non-vowel chars
        // at the end of the string, return the counters and ask if they want to do another

        // Variables
        String inputString;
        
        String lowerCaseString;
        
        char c;

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int countNonVowel = 0;

        String another = "y";

        // Scanner
        Scanner scan = new Scanner(System.in);

        // make sure the user wants to go again
        while(another.equalsIgnoreCase("y"))
        {
            countA = 0;
            countE = 0;
            countI = 0;
            countO = 0;
            countU = 0;
            countNonVowel = 0;

            System.out.print("Please enter a word or phrase: ");
            inputString = scan.nextLine();
            System.out.println();

            lowerCaseString  = inputString.toLowerCase();   // bring the string to lower case so that there is no distincting between upper and lower case vowels

            for(int i = 0; i <= lowerCaseString.length() - 1; i++)
            {
                c = lowerCaseString.charAt(i);

                switch(c)
                {
                    case 'a':
                        countA++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    case 'i':
                        countI++;
                        break;
                    case 'o':
                        countO++;
                        break;
                    case 'u':
                        countU++;
                        break;
                    default:
                        countNonVowel++;
                }
            }

            System.out.println("The phrase \"" + inputString + "\" has " + countA + " \"a\", " + countE + " \"e\", " + countI + " \"i\", " + countO + " \"o\", and " + countU + " \"u\". There are " + countNonVowel + " characters remaining which are not vowels.");
            System.out.println();
            System.out.print("Would you like to enter another phrase? (y/n) ");
            another = scan.nextLine();
            System.out.println();
        }
        scan.close();
    }
}
