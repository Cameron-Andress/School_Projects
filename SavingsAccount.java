// Savings Account object for lab 4
//Cameron Andress

public class SavingsAccount
{
  double IRate;
  double Bal;
  
  public void withdraw(double amount)
  {
     Bal -= amount;
  }
  
  public void deposite ( double amount)
  {
     Bal += amount;
  }
  
  public double getBal()
  {
     return Bal;
  }
  
  public double MonthInt()
  {
     double MInterest = ( (IRate/12) * Bal);
     Bal += MInterest;
     return MInterest;
  }
  
  public void SetIRate(double NRate)
  {
     IRate = NRate/100;
  }
  
  public SavingsAccount(double SBal)
  {
     Bal = SBal;
     IRate = 0;
  }
}       