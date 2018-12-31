/*
* (Compute greatest common divisor using recursion) The gcd(m, n) can also be
* defined recursively as follows:
 - If m % n is 0, gcd(m, n) is n.
 - Otherwise, gcd(m, n) is gcd(n, m % n).

    Write a recursive method to find the GCD. Write a test program that prompts
    the user to enter two integers and displays their GCD.
*/

import java.util.Scanner;
public class exercise_18_03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Integer: ");
        int m = input.nextInt();

        System.out.print("Enter second Integer: ");
        int n = input.nextInt();

        int divisor = gcd(m,n);
        System.out.print("the greatest common divisor: " + Math.abs(divisor) + "\n");
    }

    //function to compute the greatest common divisor
    public static int gcd(int m, int n)
    {
        if(m%n==0)
        {
            return n;
        }
        else
        {
            //call function recursive here
            return gcd(n,m%n);
        }
    }
}
