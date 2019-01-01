import java.util.Scanner;
public class exercise_18_09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string ");
        String str = input.nextLine();

        //calling the function
        reverseDisplay(str);
    }

    //
    public static void reverseDisplay(String value)
    {
        //base case
        if(value.length() == 1)
        {
            System.out.print(value);
        }
        else
        {
            //triming the last character
            char rev = value.charAt(value.length() -1);
            System.out.print(rev);
            //making the recursive call here which trims the last character
            reverseDisplay(value.substring(0,value.length()-1));
        }
    }
}
