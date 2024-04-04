/* Author: Caitlin Coulombe, T00756521
 * Date: April 3, 2024
 * Course: COMP 1131
 * Assignment 4 Question 1: Design and implement a class called Bird, which represents a bird hopping along a horizontal powerline. 
 * The bird can only hop for one unit of distance at a time, in the direction it is facing. The bird can also turn to reverse its 
 * direction. Bird requires a toString  method to return both the current position and the direction facing to the driver so it can 
 * be output. No set or get methods are required for this question.
 * 
 * For your design, create a UML class diagram similar to Figure 5.5 on page 180 of the textbook. Note that you need to incluce the 
 * constructor in the methods section if you code a constructor.
 *      Hint: Remember that a horizontal number line has a zero position in the middle with positive to the right and neative to the 
 *      left. It is your diesing choice whether the bird will land on the middle of the powerline or at some random point between two
 *      limits.
 *
 *      Testing: Write an interactive test driver that instantiates a Bird, then allows the user to manipulate it with simple commands 
 *      like Output (to see the position and direction), Hop, Turn, Exit... single letters work just fine. All output must be via the 
 *      driver not methods within Bird.. You should use this driver to create screenshot exhibits for a number of scenarios (e.g. 
 *      output original state, hop a few times, output, hop a few more times, output, turn, output, hop, output, turn, output, &c.)
 * 
 */

 import java.util.Scanner;

public class BirdOnALine {
    public static void main(String[] args) throws Exception {
        // instantiate the bird
        // accept inputs from the user (hop, turn, output, and exit)
        // use those outputs to call the corresponding method from the Bird
        // continue until the user wants to output

        // Local variables
        String userInput = "";

        final String QUIT_KEY = "0";

        final String HOP = "h";
        final String TURN_AROUND = "t";
        final String BIRD_POS = "p";

        final String ALL_COMMANDS = QUIT_KEY + HOP + TURN_AROUND + BIRD_POS;

        // instantiate objects
        Bird bird = new Bird();  // have the user input if they want the bird to start at a specific point in the final version
        
        Scanner scan = new Scanner(System.in);

        System.out.println("You watch as a beautiful bird sits on the center of a 10 metre long powerline.");
        // while the user still wants to play, give them any of four options (hop, turn, output, and exit)
        while(!userInput.equalsIgnoreCase(QUIT_KEY))
        {
            System.out.println("What would you like the bird to do next?");
            System.out.println("(Hop = H, Turn around = T, Bird position = P, or quit = 0)");

            userInput = scan.nextLine();

            while(!ALL_COMMANDS.contains(userInput))
            {
                System.out.println("That is not a valid input. Please try again. ");

                userInput = scan.nextLine();
            }

            if(userInput.equalsIgnoreCase(HOP))
            {
                boolean canHop = bird.hop();
                if(!canHop)
                {
                    System.out.println("The bird is sitting at the end of the power line. You can either stay here and enjoy the view or turn around using \"T\" and continue moving.");
                }
                else
                {
                    System.out.println("The bird hopped one space forward.");
                }
            }
            else
            {
                if(userInput.equalsIgnoreCase(TURN_AROUND))
                {
                    bird.turnAround();
                    System.out.println("The bird turned around.");
                }
                else
                {
                    if(userInput.equalsIgnoreCase(BIRD_POS))
                    {
                        System.out.println(bird);
                    }
                }
            }
        }
        System.out.println("You chose to leave the bird to enjoy the view.");
        System.out.println(bird);

        scan.close();
    }
}
