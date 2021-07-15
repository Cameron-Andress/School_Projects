// Extra Credit lab 
// Making a diamond and square with for loops
// Cameron Andress
import java.util.Scanner;

public class ExtraLab
{
   public static void main(String[] args)
   {
     //Declarations
     
     int widthS ;
     int lengthS;
     int linesD;
     int stars;
     
     
    
    
     Scanner keyboard = new Scanner(System.in);
     
     
     //Algorithm for the diamond shape
     
     
     System.out.println("How many lines do you want for the diamond?(Odd Numbers)");
     linesD = keyboard.nextInt();  
     stars = (linesD + 1) / 2; 
      
      for (int i = 1; i <= stars; i++) // Columns
      {
         for (int y = 1; y <= (stars - i); y++) // Spaces
         {
            System.out.print (" ");
         }
            
         for (int x = 1; x <= (i * 2 - 1); x++) // stars
         {
         
            System.out.print("*");
         } 
         System.out.println();  
      }
      
    
     
       for (int i = 1; i <= (stars - 1); i++) // Columns
      {
         for (int y = 1; y <= i; y++) // Spaces
         {
            System.out.print (" ");
         }
            
         for (int x = 1; x <= 2 * (stars - i) - 1; x++) // stars
         {
         
            System.out.print("*");
         } 
         System.out.println();  
      }
      
      
     
     //Algorithm for square shape (Declarations still at the top though)
     
     System.out.println("What is the length of your box?");
     lengthS = keyboard.nextInt();
     
     System.out.println("What is the width of your box?");
     widthS = keyboard.nextInt();
     
     for (int a = 1; a <= lengthS; a ++)
     {
        for( int b = 1; b<= widthS; b++)
        {
           if(a == 1 || a == lengthS || b == 1 || b == widthS)
           {
              System.out.print("*");
           }
           else
           {
              System.out.print(" ");
           }
        }
        System.out.println();
     }      
     
            
   }
}         