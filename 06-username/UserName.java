
/**
 * Write a description of class UserName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Are you a student or teacher? ");
    String job = s.nextLine();
    
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("What is your favorite number? ");
    String favNum = s.nextLine();
    String email = "";
    if (job.equals("student")) {
        lastName = getInitial(lastName);
        email = "@nycstudents.net";
    }
    else if (job.equals("teacher")) {
        firstName = getInitial(firstName);
        email = "@schools.nyc.gov";
    }
    // test output
    String combine = (firstName + lastName + favNum + email);
    System.out.println(combine);
    
    System.out.println("How long do you want your password to be?");
    int length = s.nextInt();
    String password = generatePassword(length);
    System.out.println(password);
    
    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method

  public static String generatePassword(int length) {  
    String password = "";
        
    for (int i = 0; i<length; i++) {
        int rand = (int)((Math.random()*26)+65);
        char c = (char)rand;
                
        int rando = (int)((Math.random()*26)+97);
        char l = (char)rando;
                
        int num = (int)(Math.random()*10);
            
        int choice = (int)(Math.random()*3+1);
        if (choice == 1) {
            password += c;
        }
        else if (choice == 2) {
            password += l;
        }
        else {
            password += num;
        }
        } // end for statement
    return password;
    } //end generatePassword
}
