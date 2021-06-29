import javax.swing.JOptionPane;

public class TestQ2
{
   public static void main(String[] args)
   {
      double payRate;
      String inputRead;
      inputRead = JOptionPane.showInputDialog("What is your hourly pay?");
      payRate = Double.parseDouble(inputRead);
      System.exit(0); 
   }
}      