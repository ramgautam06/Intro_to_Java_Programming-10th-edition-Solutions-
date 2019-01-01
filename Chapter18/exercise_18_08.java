import java.util.Scanner;
public class exercise_18_08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an Integer  ");
        int integer = input.nextInt();

        reverseDisplay(integer);
        System.out.printf("\n");
    }

    //functions that computes the reverse of an integer
    public static void reverseDisplay(int integer)
    {
        //if the number is less than 10, simply print the number
        if(integer < 10 )
        {
            System.out.print(integer);
        }
        else
        {
            System.out.print(integer%10);
            //call the function recursively
            reverseDisplay(integer/10);
        }
    }
}
