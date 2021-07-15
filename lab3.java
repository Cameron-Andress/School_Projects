/*Lab #3The ACE Insurance Company uses a computer program to calculate new premiums for new young male drivers
who have had their first automobile accident.  
The new premiumequals the old premium multiplied by a rate. 
The rate is based on the applicant’s age.  The premiums are:
AgeRate160.20170.20180.19190.17200.17210.15220.13
You are to input a driver’s ID, age, and old premium from a data file. 
After the java program calculates the new premium, the program sends the output to an output file. 
Data File: (Put data into a notepad file) for 
input263416500.00785419450.94363921621.19868817341.58454520261.78390722201.89341221314.24658918312.98
Data File for output must be formatted:    
2634 16  500.00  600.00    
Be sure to check for the file on input and output.
Cameron Andress*/
    
import java.io.*;
import java.util.Scanner;

public class lab3
{
   public static void main (String[] args)throws IOException
   
   {
      
      String inputF; // first file needed for calculations  labThree.txt
      String outputF; // results will be in this file   labThreeResults.txt
      int accountNumber;
      int age;
      double oPremium;
      double nPremium=0;      
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter name of input file"); // use labThree.txt
      inputF = keyboard.nextLine();
      
      File file = new File(inputF);
      Scanner inputFile = new Scanner(file);
      
      System.out.println("Enter name of output file."); // use labThreeResults.txt
      outputF = keyboard.nextLine();
      
      FileWriter fwriter = new FileWriter(outputF,true);       
      PrintWriter outFile = new PrintWriter(fwriter);
      
      
      while (inputFile.hasNext()) // processing the file
      {
         accountNumber = inputFile.nextInt();
         age = inputFile.nextInt();
         oPremium = inputFile.nextDouble();
         
    
         switch (age)  // calculations for new premiums 
         {
            case(16):
            case(17):
               nPremium = oPremium / 0.20;
               break;
            case(18):
               nPremium = oPremium / 0.19;
               break;
            case(19):
            case(20):
               nPremium = oPremium / 0.17;
               break;
            case(21):
               nPremium = oPremium / 0.15;
               break;
            case(22):
               nPremium = oPremium / 0.13;
               break;
            default:
         }                  
       
  
         outFile.printf("%-5d%3d%9.2f%9.2f", accountNumber, age, oPremium, nPremium); // output to the output file to be used as a report
         outFile.println();
      }
      
      outFile.close();
      inputFile.close();   
      
   }
}         