/* Author: Caitlin Coulombe, T00756521
 * Date: March 25, 2024
 * Course: COMP 1131
 * Assignment 3 Question 1: Design and implement an application that plays the Over-Under guessing game using single letters.
 *  The program should pick a random letter between 'a' and 'z' (inclusing), then repeatedly prompt the user to guess the 
 *  letter. One each guess, report to the user that they are correct or that the guess is over or under the random letter. 
 * Continue accepting guesses until the user guesses correctly or chooses to quit. Count the number of guesses and report 
 * that value when the user guesses correctly. If a guess is not a letter, an appropriate message should be displayed to the
 *  user and the guess not counted. At the end of each game (by quitting or a correct iess), prompt to determine whether the 
 * user wants to play again. Continue playing another game until the user chooses to stop
 *      Hint: This will require nexted loops - the outer loop to play each game until the user chooses to quit stop and the 
 *      inner loop to prompt the user for each guess
 *      Testing: Include exhibits that demonstrate all of the program's featuers: multiple completed game, a game quit in 
 *      progress, and how an input out of range is handled
 * 
 *  From the assignment: The following code will randomly generate a single letter:
 *      Random rng = new Random();
 *      char c = (char)('a' + rng.nextInt(26));
 */

 import java.util.Scanner;

 import java.util.Random;

public class  OverUnderGame {
    public static void main(String[] args) {
        // introduce the game
        // while to make sure the player still wants to play
        // generate a random letter
        // take a guess from the player
        // make sure the guess is a valid input
        // compare the valid guess to the actual letter and report the results
            // if it is equal, then congrats, report how many guesses it took
            // if it is less than, then tell them higher
            // if it is more than, then tell them lower
        // ask for another guess
        // continue until they quit
        // after quitting or getting it right the while loop, ask if they want to play again

        // Variables
        String input;
        String instructions;

        boolean isCorrect = false;
        int numOfGuesses;

        final String SENTINEL = "0";
        String another = "y";

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Random char variables
        Random rng = new Random();
        char c;
        String randomLetter;

        // Introduce the game
        System.out.print("Welcome to the Over-Under guessing game! Do you want to hear the instructions? (y/n) ");
        instructions = scan.nextLine();
        System.out.println();

        if(instructions.equalsIgnoreCase("y"))
        {
            System.out.println("Gladly! In this game, I will randomly pick a lower case letter and will then prompt you to try to guess the letter."); 
            System.out.println("After you guess, I will tell you if you were correct or not.");
            System.out.println("If you guessed wrong, I will also tell you if my letter is higher or lower than your guess.");
            System.out.println("If I tell you \"Higher\" it means that my letter is closer to \"a\" and the opposite is true for \"lower\".");
            
            System.out.println("You can quit out of the game at any time by typing zero (0).");
            System.out.println("Good luck!");
            System.out.println();
        }

        // Play the game
        // Ensure the player has not quit out of the game
        while(another.equalsIgnoreCase("y"))
        {
            // reset the number of guesses for each new game
            numOfGuesses = 0;
            // reset the game status
            isCorrect = false;
            input = "1"; 

            // Determine what the random letter is for this round
            c = (char)('a' + rng.nextInt(26));
            randomLetter = String.valueOf(c);   // convert the char to string so that it can be compared against the strings read from the user

            // debugging - REMOVE IN FINAL VERSION
            // System.out.println("Debug: the random letter is: " + randomLetter);

            System.out.println("Okay, I've picked a random letter! Lets play!");

            // While they have not guessed the letter, ask for a letter and compare it to the random
            while(!isCorrect && !input.equals(SENTINEL))
            {
                // prompt the user for a guess
                System.out.print("Please enter a letter to guess: ");
                input = scan.nextLine();
                System.out.println();

                while(!input.equals(SENTINEL) && (input.length() != 1 || input.compareTo("a") < 0 || input.compareTo("z") > 0))
                {
                    System.out.print("That is not a valid guess. Please enter a single lower case letter: ");
                    input = scan.nextLine();
                    System.out.println();
                } 

                numOfGuesses++;

                //compare the guess to the actual letter
                if(!input.equals(SENTINEL))
                {
                    if(randomLetter.compareTo(input) == 0)
                    {
                        isCorrect = true;
                    }
                    else
                    {
                        if(randomLetter.compareTo(input) < 0)
                        {
                            // the number is negative which means that the actual letter is lower than the guess
                            System.out.println("Higher - closer to \"a\"");
                        }
                        else
                        {
                            System.out.println("Lower - closer to \"z\"");
                        }
                    }
                } 
            }

            // the player left the game
            if(isCorrect)
            {
                System.out.println("Congratulations! You guessed my letter in " + numOfGuesses + " guesses!");
                System.out.println();

                System.out.print("Do you want to play again? (y/n) ");
                another = scan.nextLine();

                System.out.println();
            }
            else
            {
                System.out.print("You chose to quit that round. Do you want to try again with a new random letter? (y/n) ");
                another = scan.nextLine();

                System.out.println();
            }
        }
        System.out.println("Thanks for playing!");
        scan.close();
    }
}
