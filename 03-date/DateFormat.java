
/**
 * Write a description of class DateFormat here.
 *
 * @author (your name)
 * @ 9/28/22
 */

import java.util.Scanner;
public class DateFormat
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("What day of the week is it? ");
        String day = s.nextLine();
        
        System.out.print("What month is it? ");
        String month = s.nextLine();
        
        System.out.print("What year is it? ");
        String year = s.nextLine();
        
        System.out.print("What day of the month is it? ");
        String num = s.nextLine();
        s.close();
        
        System.out.println("Today is " + day + ", " + month + " " + num + ", " + year);
        System.out.println("Today is " + day + " " + num + " " + month + " " + year);
    } //end of main method
    
    
} //end of date class
