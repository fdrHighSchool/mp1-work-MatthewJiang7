
/**
 * Write a description of class LanternFly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("The lanternfly is an invasive species and a threat to our trees and plants. How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            int bugs = 10 - num;
            System.out.println("You can do better than that! Squish " + bugs + " more to do your part!");
        } // end if statement
        else {
            System.out.println("Thanks for doing your part, how many more do you plan to squish?");
            int numb = input.nextInt();
                if(numb > 100) {
                    System.out.println("Woah slow down, you may cause an extinction yourself!");
                }
                else {
                    int score = numb/10;
                    System.out.println("That's a " +  score + " out of 10!");
        } // end else statement
        input.close();
    } // end main method

} // end class
}

