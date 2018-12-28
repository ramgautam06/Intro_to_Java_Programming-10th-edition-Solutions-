//Geometry of two circles
import java.util.Scanner;
public class exercise_03_29
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter circles1's radius , x1 -cordinate , y1-cordinate ");
        double r1 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter circles2's radius , x2 -cordinate , y2-cordinate ");
        double r2 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //computing the values here
        double distance = Math.pow((Math.pow((y2-y1),2) + Math.pow((x2-x1),2)), 0.5);
        double x = Math.abs(r1-r2);
        double y = r1+r2;

        if(distance <= x)
        {
            System.out.print("Circle2 is inside Circle1");

        }
        else if(distance <= (y))
        {
            System.out.print("Circle2 overlaps Circle1");
        }
        else
        {
            System.out.print("Circle2 does not overlap Circle1");
        }
    }
}
