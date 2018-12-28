//
import java.util.Scanner;

public class exercise2_1 {
    public static void main(String[] args) {
        System.out.println("Hello Love ");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter degree in celscius ");
        double celsius = input.nextDouble();

        //converting
        double fahren = (9.0/5) * celsius + 32;

        System.out.println(celsius + " degree celsius is " + fahren + " in Fahrenheit " );
    }
}
