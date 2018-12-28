/*
*(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.
 */
import java.util.Scanner;
public class exrecise_06_03
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter an integer ");
        int number = input.nextInt();

        boolean flag = isPalindrome (number);

        if(flag == true)
        {
            System.out.println(number  + " is a Palindrome");
        }
        else
        {
            System.out.println(number  + " is not a Palindrome");
        }
    }

    //return true if the number is palindrome
    public static boolean isPalindrome (int number)
    {
        int rev = reverse (number);
        if(rev == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //returning the reverse number here
    public static int reverse (int number)
    {
        int reverse = 0;
        while(number !=0)
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number /10;
        }
        return reverse;
    }
}
