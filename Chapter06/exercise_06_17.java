/*
(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix.
*/

import java.util.Scanner;

public class exercise_06_17
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the size of matrix ");
       int size = input.nextInt();

       //calling the function to print matrix
        printMatrix(size);
    }

    //printing the matrix here
    public static void printMatrix(int n)
    {
        for(int i = 0 ; i < n;i++)
        {
            for(int j = 0; j <n; j++)
            {
                //return random number 0 and 2
                System.out.print(((int)(Math.random() * 2))+ " ");
            }
            System.out.println();
        }
    }
}
