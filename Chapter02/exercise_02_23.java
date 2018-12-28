import java.util.Scanner;

public class exercise_02_23 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance to drive ");
        double distance = input.nextDouble();

        System.out.print("Fuel efficiency of the car per gallon ");
        double efficiency = input.nextDouble();

        System.out.print("Price per gallon ");
        double price_gallon = input.nextDouble();

        //compute the cost of the trip
        double cost = (distance * price_gallon)/(efficiency);
        cost = (int)(cost);
        System.out.println("The cost of driving is $ " + cost);
    }
}


