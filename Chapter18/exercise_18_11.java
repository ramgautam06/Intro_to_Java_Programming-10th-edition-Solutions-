//Sum the digits in an integer using recursion
import java.util.Scanner;
public class exercise_18_11
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer ");
        int n = input.nextInt();
        int sum = sumDigits(n);
        System.out.print("the sum is " + sum);
        System.out.println();
    }

    //computing the sum
    public static int sumDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }
        else
        {
            //recursive call here
            return n%10 + sumDigits(n/10);
        }
    }
}
