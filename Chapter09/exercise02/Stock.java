public class Stock
{
    //fields
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    //creating the constructor
    Stock(String newsymbol, String newname)
    {
        symbol = newsymbol;
        name = newname;
    }

    //method that returns the percentage changed
    double getChangePercent()
    {
        double percentage = ((currentPrice-previousClosingPrice)/(previousClosingPrice)) * 100;
        return percentage;
    }
}
