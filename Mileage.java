// This program computes the mpg for a car
// Cameron Andress
import java.util.Scanner;

public class Mileage
   {
      public static void main(String[] args)
         {
            int begMiles; // primative declaration
            int endMiles;
            double gals;
            double mpg;
            
            Scanner keyboard = new Scanner(System.in); // syntax to allow keyboard/console input
            
            System.out.print("What was your begining mileage "); // Give the user a message about what to type
            begMiles = keyboard.nextInt();                       // assignment of input to variable
            
            System.out.print("What was your ending mileage ");
            endMiles = keyboard.nextInt();
            
            System.out.print("How many gallons of gas pumped ");
            gals = keyboard.nextDouble();
            
            mpg = (endMiles - begMiles)/gals; // () changes order of operations
            
            System.out.print("\n\nMiles per Gallon " + mpg);
         }
   }         