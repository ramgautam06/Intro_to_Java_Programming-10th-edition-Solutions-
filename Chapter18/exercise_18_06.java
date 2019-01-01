public class exercise_18_06
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

    //
    public static double m(double i)
    {
        //base case, indicating that the program is done
        if (i==0)
        {
            return 0;
        }
        else
        {
            //recursive function here
            return i/(i+1) + m(i-1);
        }
    }
}
