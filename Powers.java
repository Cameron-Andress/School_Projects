import java.util.Scanner;  // Needed for the Scanner class
/**
This program demonstrates the Scanner class and use of Math.pow.
Cameron Andress
*/

public class Powers
{
   public static void main(String[] args)
   {
               //Declarations
               
      int num; // To hold a value of any number
      
      
               //Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Please type in a number of your liking. ");
      num = keyboard.nextInt();
      
      System.out.println("The square of " + num + " is " + Math.pow(num, 2.0));
      
     
   }
}      