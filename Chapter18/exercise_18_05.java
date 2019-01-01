
public class exercise_18_05
{
    public static void main(String[] args)
    {
        System.out.println("Calculates the sum until i ");
        System.out.printf(" i        m(i)\n");
        System.out.printf("---------------\n");
        for(int i= 1; i <=10; i++)
        {
            System.out.printf("%2d %10.2f\n", i, m(i));
        }
    }

    //computes m(i) here
    public static double m(double i)
    {
        //this is the base case
        if(i==0)
        {
            return (0);
        }
        else
        {
            //recursive call making from here
            return i / (2 * i + 1) + m(i - 1);
        }
    }
}
