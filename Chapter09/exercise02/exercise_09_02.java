import java.util.Scanner;
public class exercise_09_02
{
    public static void main(String[] args)
    {
        //creating the object here
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.previousClosingPrice = 34.5;
        s.currentPrice = 34.35;

        //Display results
        System.out.println("Stock symbol: " +  s.symbol);
        System.out.println("Stock name: " +  s.name);
        System.out.printf("The percentage change: %.2f", s.getChangePercent());
    }
}
