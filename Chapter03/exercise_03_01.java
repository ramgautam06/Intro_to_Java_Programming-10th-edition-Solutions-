/*
 * Solve Quadratic Equation
 */

import java.util.Scanner;

public class exercise_03_01
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value ");
        double a = input.nextDouble();

        System.out.print("Enter b value ");
        double b = input.nextDouble();

        System.out.print("Enter c value ");
        double c = input.nextDouble();

        double  discriminant = b*b - 4 * a*c;
        double dis =  Math.pow(discriminant,0.5);

        //checking the discriminant here
        double root1, root2 = 0;
        if (dis > 0)
        {
            root1 = (-b + dis) / 2;
            root2 = (-b - dis) / 2;

            System.out.print("The equation has two roots " + root1 + " and " + root2);
        }
        else if(dis == 0)
        {
            root1 = (-b + dis) / 2;
            System.out.print("root: " + root1);
        }
        else
        {
            System.out.print("It does not have a real root ");
        }
    }
}
