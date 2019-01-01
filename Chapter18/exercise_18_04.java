/*
*
*/

public class exercise_18_04
{
    public static void main(String[] args)
    {
        System.out.println("\n i    m(i)");
        System.out.println("-----------");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i + "    " + m(i));
        }
    }

    // computing m(i) which returns double value
    private static double m(double i)
    {
        if (i == 1)
        {
            return 1;
        }
        else
        {
            //making recursive call here
            return 1 / i + m(i - 1);
        }
    }
}


