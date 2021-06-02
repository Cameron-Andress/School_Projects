import javax.swing.JOptionPane;  // Needed for the JOptionPane class
/**
This program demonstrates the JOptionPane Class and using dialog boxes and equations
Cameron Andress
*/

public class Circles
{
   public static void main(String[] args)
   {
               //Declarations
               
      String input; // To read input
      double rad; //radius
      double circ; // the circumference
      double area; // area of circle
      double pi; // place holder for pi
      double dMeter; // diameter of circle
      
      
               //Create dialog box to type in radius of the circle
      input = JOptionPane.showInputDialog("What is the radius of the circle? ");
      rad = Double.parseDouble(input);     
              // Calculations
      pi = 3.14159;
      area = pi * Math.pow(rad, 2.0);
      circ = 2 * pi * rad;
      dMeter = 2 * rad;
      
      // Display the results
      JOptionPane.showMessageDialog(null, " The radius is " + rad);
      JOptionPane.showMessageDialog(null, " The circumference is " + circ);
      JOptionPane.showMessageDialog(null, " The diameter is " + dMeter);
      JOptionPane.showMessageDialog(null, " The area is " + area);   
      
      
       // End of program
     System.exit(0);
   }
}      