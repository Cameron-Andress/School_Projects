// Cameron Andress While loops
import java.util.Scanner;

class WhilePrac
   {
   
      public static void main(String []args)
        {
        
        // Declarations
        
        int x = 4;
        odd = 0;
        even = 0;
        Scanner keyboard = new Scanner(System.in);
        
        // First example in class with basic while loop.
        while (x <= 14 )
           {
              System.out.println("x = " + x);
              x += 2;
           }
        // Second example with while loops (more complex). Using a sentienel value and priming read without validation.
        
        System.out.println("Please enter a Number--Enter -1 to stop");
        number = keyboard.nextInt();
        while (number != -1)
           {
              if (number % 2 == 0)
                 even++;
                 else odd++;
                 
              System.outprintln("Please enter a Number--Enter -1 to stop");      
              number = keyboard.nextInt();
           }   
        }
     }         
        
