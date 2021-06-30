// This program demonstrates an if-else statement.
import java.util.Scanner;
public class Division
{
   public static void main(String[] args)
   {
      double number1, number2;    // Division operands
      double quotient;            // Result of division
      
      // create scanner for input
      Scanner keyboard = new Scanner(System.in);
      
      
      // Code for user to input 
      System.out.print("Enter a number: ");
      number1 = keyboard.nextDouble();
      
      System.out.print("Enter another number: ");
      number2 = keyboard.nextDouble();
      
      
      if (number2 == 0)
      {
         System.out.println("It is impossible to divide by zero.");
         System.out.println("User must rerun the program.");
         System.out.println("Do not use zero. Thank you!");
      }
      else
      {
         quotient = number1 / number2;
         System.out.println("The quotient of " + number1);
         System.out.println(" divided by " + number2);
         System.out.println(" is " + quotient);  
      }
   }
}          