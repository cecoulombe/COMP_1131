/* Author: Caitlin Coulombe, T00756521
 * Date: April 3, 2024
 * Course: COMP 1131
 * Assignment 4 Question 1: See class BirdOnALine for more details on the assignment
 */

import java.util.Random;

 // Create the blueprint for the bird objects inlcuding the behaviours and the states
public class Bird {

    // give the bird variables
    // define each method and waht it should be able to do
    // test driven development - test that each method works as you are developing them and work back and forth with the main
    // methods to give: constructor, hop, turn, toString, landing (if you want a random landing position)


    // Class variables
    int currentPosition;
    int jumpDistance = 1;

    int currentDirection = 1;   // current direction of 1 means facing right, -1 means facing left.

    int powerLineLength = 10;    // the power line is currently 10 metres long, meaning it can go from -5 to 5 with 0 being in the middle.
    // -----------------------------------------------------------------------------------------
    // Constructor: Create a bird which will come down and sit at the center of the powerline.
    // -----------------------------------------------------------------------------------------
    public Bird()
    {
        // variables for each bird
        int landingPoint = 0;
        currentPosition = landingPoint;
    }
    
    // -----------------------------------------------------------------------------------------
    // Constructor: Create a bird which will come down and sit at the position on the line as 
    // determined by the user.
    // -----------------------------------------------------------------------------------------
    public Bird(int landingPoint)
    {
        if(Math.abs(landingPoint) <= Math.abs(powerLineLength / 2))
        {
            currentPosition = landingPoint;
        }
        else
        {
            Random rand = new Random();
            currentPosition = rand.nextInt(-5, 6);  // DOUBLE CHECK THAT THIS IS VALID
        }
    }

    // -----------------------------------------------------------------------------------------
    // Hop: move the bird over one unit in the direction it is facing so long as it is still on 
    // the line. If false is returned, the bird is at the end of the line and needs to turn around
    // -----------------------------------------------------------------------------------------
    public Boolean hop()
    {
        // move the bird over one jump length in the direction it is facing, so long as it is still on the powerline
        int intendedPosition = currentPosition + (jumpDistance * currentDirection);

        if(Math.abs(intendedPosition) <= Math.abs(powerLineLength / 2))
        {
            currentPosition = intendedPosition;
            return true;
        }
        else
        {
            return false;
        }
    }

    // -----------------------------------------------------------------------------------------
    // turnAround: turn the bird to face the opposite direction
    // -----------------------------------------------------------------------------------------
    public void turnAround()
    {
        currentDirection *= -1;
    }

    // -----------------------------------------------------------------------------------------
    // toSrting: print the current direction of the bird
    // -----------------------------------------------------------------------------------------
    public String toString()
    {
        boolean direction;
        if(currentDirection > 0)
        {
            direction = true;
        }
        else
        {
            direction = false;
        }
        
        return "The bird is sitting at position " + currentPosition + " and is facing " + (direction ? "right!" : "left!");
    }
    



}
