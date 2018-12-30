/*
* Write a program that reads the integer between 1 and 100
* and counts the occurrences of each. Assume the input ends
* with 0. Here is a sample run of the program;
 */
import java.util.Scanner;
public class exercise_07_03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of your choice between 1 - 100 ");
        int num = input.nextInt();

        //read as long as input is not zero
        int i = 0;
        int [] occurance = new int [100];
        while(num !=0)
        {
            occurance[i] = num;
            System.out.print("Enter the number of your choice between 1 - 100 ");
            num = input.nextInt();
            i++;
        }

        System.out.println(" ------------------------------ " );
        //print the elements of the array
        int times = 0;
        int pnum = 0;
        for(int j = 1; j <=100;j++)
        {
            for(int k = 0; k <i; k++)
            {
                if(j == occurance[k])
                {
                    times++;
                    pnum = occurance[k];
                }
            }

            //printing here
            if(times > 0)
            {
                System.out.println(pnum + " occurs " + times + " times.");
                times = 0;
                pnum=0;
            }
        }

    }
}
