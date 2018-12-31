/*
* Fibonacci numbers
 */
import java.util.Scanner;
public class exercise_18_02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number index ");
        int index = input.nextInt();
        System.out.printf(fib(index) + "  \n");

        //now printing the sequence up to the index without using recursion
        System.out.printf("-------- Printing the Sequence ---------- \n");
        int f0 = 0;
        int f1 = 1;
        for(int i = 1; i <=index; i++)
        {
            int f2 = f0 + f1;
            System.out.printf(f2+ " ");
            f0 = f1;
            f1 = f2;
        }
        System.out.printf(" \n");
    }

    //the function returns the Fibonacci numbers
    public static int fib(int index)
    {
        int f0 = 0;
        int f1 = 1;
        int currentFib = 0;

        if(index == 0)
        {
            return f0;
        }
        else if(index == 1)
        {
            return f1;
        }
        else
        {
            for(int i = 1; i <=index;i++)
            {
                currentFib = f0 + f1;
                f0=f1;
                f1 = currentFib;
            }
            return currentFib;
        }
    }
}
