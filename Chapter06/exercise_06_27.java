/*
(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
...
*/

import java.util.Scanner;
public class exercise_06_27
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Empire Numbers ");
        int number = input.nextInt();
        //call the function to check either it is prime or not

        int start = 2;
        int emirp_count = 0;
        int count = 0;

        while (emirp_count< number)
        {
            boolean flag = isprime(start);
            if (flag)
            {
                //reverse the number and make sure it is non-palindromic
                int reverse = num_reverse(start);

                //check if the reverse number is prime
                boolean freverse = isprime(reverse);
                if(freverse == true)
                {
                    if( start !=reverse)
                    {
                        System.out.print(start + " ");
                        emirp_count++;
                        count++;

                        //printing 10 digits per line
                        if(count%10 == 0)
                        {
                            System.out.println();
                        }
                    }
                }
            }
            start++;//increasing the start here
        }
    }//end of the main here

    //checking the prime numbers
    public static boolean isprime(int number)
    {
        //System.out.print(number + " ");
        boolean flag = true;

        for(int i = 2; i <=number/2; i++)
        {
            if(number%i == 0)
            {
                flag = false;
            }
        }
        return (flag);
    }

    //function returns the reverse number
    public static int num_reverse (int number)
    {
        int reverse = 0;
        while(number > 0)
        {
            int digit = number%10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        return reverse;
    }
}