/*
(Reverse the numbers entered)
        Write a program that reads ten integers and displays them
        in the reverse of the order in which they were read.
*/

import java.util.Scanner;
public class exercise_07_02 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //creates an array that can hold 10 elements
        int[] list = new int[10];
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter your integers ");
            list[i] = input.nextInt();
        }

        //printing them in reverse
        System.out.println("------------------------");
        for (int k = 9; k >=0;k--)
        {
            System.out.print(list[k] + " ");
        }
    }
}
