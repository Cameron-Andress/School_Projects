//Cameron Andress
// This is a simple java program

public class MyVars
   {
      public static void main(String[] args)
         {
            int speed; //declaration
            double time;
            double distance;
            int ctr = 0; // initialization of a counter -- goes up by a set amount
            double amt1;
            float amt2;
            double bal = 0; //initalization of an accumulator -- goes up by a varying amount
            char alpha;
            boolean truth; // only true or false
            int red;
            int green;
            int yellow;
            int blue;
            
            speed = 20;
            time = 8.59;
            amt1 = 1234.567;
            amt2 = 2.9f;
            alpha = 'A';
            time = 8.59; // place holder for value. only holds memory for one thign at a time (now time is 10 and the old 10 is gone)
            red = 20;
            green = 3;
            blue = red / green; // there is an order of operations PEMDAS
            yellow = red % green;
            
            distance = speed * time;
            
            red += 5; // use the value of red plus 5
            System.out.println("Distance is " + distance + " Modulus Example " + yellow + " Division Example " + blue);
         }
   }      
            