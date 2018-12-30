/*
Write two overloaded methods that return the average of an
        array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
        Write a test program that prompts the user to enter ten double values, invokes this
        method, and displays the average value.
*/
import java.util.Scanner;
public class exercise_07_08
{
    public static void main (String[] args)
    {
        //array for the 10 elements
        double [] array = new double[10];
        Scanner input = new Scanner(System.in);

        //taking the for 10 elements
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Enter the integer ");
            array[i] = input.nextDouble();
        }

        //calling the function
        double ave = average(array);
        System.out.printf("The average is %.2f", ave);
    }

    //calculate sum of the array
    public static int average(int[] array)
    {
        return 0;
    }

    //calculates the average of the array
    public static double average(double[] array)
    {
        double sum = 0;
        for(int i = 0; i < 10;i++)
        {
            sum = sum + array[i];
        }
        return sum/10;
    }
}

