
/**
 * Write a description of class RandomNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
// import java.util.*
public class RandomNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("What game mode?\neasy\nmedium\nhard");
        String mode = s.nextLine();
        mode = mode.toLowerCase();
        
        int maximum;
        if(mode.equals("easy")) {
            maximum = 10;
        }
        else if(mode.equals("medium")) {
            maximum = 50;
        }
        else {
            maximum = 100;
        }
        
        int mysteryNumber = (int)(Math.random()*maximum+1);
        
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt();
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class

    
