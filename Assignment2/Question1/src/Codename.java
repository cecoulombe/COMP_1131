/* Author: Caitlin Coulombe, T00756521
 * Date: March 18, 2024
 * Course: COMP 1131
 * Assignment 2 Question 1: Write an application that prompts for and obtains a persons first and last name (separately), 
 * then composes and displaces a new codename for a computer game syste. The codename is to be a string composed of the 
 * first m characters of the persons first name, followed by the first n letters of the persons last name. The values of m 
 * and n are to be a random number from 1 to the number of characters in the respective name.
 *      Testing: Include at least five test exhibits, including "Michael Jackson", your own name, and at least 3 others 
 *      (include some edge cases with only 1 letter in the name);
 */

 import java.util.Random;

 import java.util.Scanner;

public class Codename {
    public static void main(String[] args) {
        // prompt for the first and the last name separately and make sure they are strings
        // find the length of each
        // determine a random number for first and last name
        // get a substring from each
        // create a codename that combined the substrings
        // print the codename

        // Variables
         String firstName;
         String lastName;

         int firstNameLength;
         int lastNameLength;

         int randFirst;
         int randLast;

         String firstNameCode;
         String lastNameCode;

         String codeName;

         Random rand = new Random();

         Scanner scan = new Scanner(System.in);

         // Prompt the user for the first name

         System.out.println("Please enter your first name");
         
         firstName = scan.next();

         // Prompt the user for their last name

         System.out.println("Please enter your last name");
         
         lastName = scan.next();

         scan.close();

         // determine the length of the first name and use that to pick a random substring and assign that to the code name
         firstNameLength = firstName.length();

         randFirst = rand.nextInt(firstNameLength) + 1;
        //  System.out.println("Rand first is " + randFirst);

         firstNameCode = firstName.substring(0,randFirst);

         // determine the length of the first name and use that to pick a random substring and assign that to the code name
         lastNameLength = lastName.length();

         randLast = rand.nextInt(lastNameLength) + 1;
        //  System.out.println("Rand last is " + randLast);

         lastNameCode = lastName.substring(0, randLast);

         // create and output the codename
         codeName = firstNameCode + lastNameCode;

         System.out.println("Your codename is: " + codeName);
    }
}
