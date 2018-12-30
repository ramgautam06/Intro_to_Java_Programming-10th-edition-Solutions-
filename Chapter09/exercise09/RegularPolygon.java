public class RegularPolygon
{
    private int n = 3; //number of sides in polygon
    private double side = 1; //length of side
    private double x =  0; //x-cordinate
    private double y =  0; //y-cordinate

    //a non-arg constructor that creates the regular polygon
    RegularPolygon()
    {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    //constructor with number of sides and length of side
    RegularPolygon(int newn, double newside)
    {
        n = newn;
        side = newside;
        x = 0;
        y = 0;
    }

    //constructor with specified number of sides, length of side, x- and y-coordinate
    RegularPolygon(int newn, double newside, double newx, double newy)
    {
        n = newn;
        side = newside;
        x = newx;
        y = newy;
    }

    //mutators set-methods of all data fields
    //---------------------------------------
    public void setn(int newn)
    {
        n = newn;
    }

    public void setside(double newside)
    {
        side = newside;
    }

    public void setx(double newx)
    {
        x = newx;
    }

    public void sety(double newy)
    {
        y = newy;
    }

    //accessors get-methods of all data fields
    //----------------------------------------
    public int getn()
    {
        return n;
    }

    public double setside()
    {
        return side;
    }

    public double setx()
    {
        return x;
    }

    public double sety()
    {
        return y;
    }

    //method that returns the perimeter of the polygon
    public double getPerimeter()
    {
        double perimeter = 0;
        //do calculation here
        perimeter = n * side;
        return perimeter;
    }

    //methods that returns the area of the polygon
    public double getArea()
    {
        double area = 0;
        area = (n * Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        return area;
    }
}
