/*Lab #4 is from the book on page 399  #13.  
1.Create the SavingsAccount object found in #12 on page 398.  The interest rate is 12% per year.
2.Do not complete parts A, B, or C.  Only create the object and its needed fields and methods
3.Then proceed to do the steps outlined in #13 on page 399.
4.Zip your files into a folder named <yourLastNameLab 4.  
Be sure to upload the text files, the object’s java class, and the java application programs 
Cameron Andress */

import java.io.*;
import java.util.Scanner;

public class Lab4
{
   public static void main(String[] args) throws IOException
   {
      double TInterest = 0;  
      SavingsAccount account = new SavingsAccount(500);
      account.SetIRate(12);
      
      File fileD = new File ("Deposits.txt");
      File fileW = new File ("Withdrawals.txt");
      Scanner DepWi = new Scanner(fileD);
      
      while(DepWi.hasNext())
      {
         account.deposite(DepWi.nextDouble());
      }
      
      DepWi.close();
      DepWi = new Scanner(fileW);
      while(DepWi.hasNext())
      {
         account.withdraw(DepWi.nextDouble());
      }
      
      DepWi.close();
      
      TInterest = account.MonthInt();
      
      System.out.printf("Total Balance is: $%,.2f\nTotal Interest is: $%,.2f",account.getBal(), TInterest);   
   
   }  

}          