/* This is Lab number 1 for CIS-1500
Cameron Andress */

import java.util.Scanner; // needed for input 

public class Lab1
{
   public static void main(String[] args)
   {
      // Declarations
      int pen ;
      int quart ;
      int dime ;
      int nick ;
      int total;
      
      System.out.println("How many pennies do you have?"); // type 9999
      Scanner keyboard = new Scanner(System.in);
      
      //Calculations
      pen = keyboard.nextInt();  
      quart = pen / 25;
      total = quart * 25 ;
      total = pen - total ;
      dime = total / 10 ;
      total = total - (dime * 10);
      nick = total / 5;
      
      
      // Results
      System.out.println(" You would be able to get " + quart + " quarters.");
      System.out.println(" You would also get " + dime + " dimes.");
      System.out.println(" Then you would get " + nick + " nickles.");
      System.out.println(" Lastly you would have " + total + " pennies left over.");   
   }
}           