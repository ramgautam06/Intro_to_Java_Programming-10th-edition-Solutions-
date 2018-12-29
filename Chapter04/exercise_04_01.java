//working chapter 04:- Calculate the area of the pentagon
import java.util.Scanner;
public class exercise_04_01 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from center to vertex ");
        double r = input.nextDouble();
        double s = 2 * r * Math.sin(Math.PI/5);

        //calculate the area now
        double area = (5 * Math.pow(s,2))/(4* Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %4.2f ", area);
    }
}
