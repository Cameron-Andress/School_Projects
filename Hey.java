import java.io.PrintStream;
// Just messing around with some code
// Visual studio code is new to me so I wanted to test it out

public class Hey
{
    private static PrintStream printf;

    public static void main(String[] args)
    {
        int number = 89;
        double num = 89.67;

        System.out.printf("Number is: %8d\n", number);
        printf = System.out.printf("Number is : %06.4f\n", num);
    }
}