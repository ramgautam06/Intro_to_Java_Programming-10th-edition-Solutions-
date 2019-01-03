public class exercise_10_4
{
    public static void main(String [] args)
    {
        //mypoint object1
        Mypoint point1 = new Mypoint();
        //mypoint object2
        Mypoint point2 = new Mypoint(10,30.5);
        //calling function to compute distance
        System.out.printf("The distance between the points is %.2f\n", point1.distance(point2.getX(),point2.getY()));
    }
}

//defining class here
class Mypoint
{
    //instance variables
     private double x;
     private double y;

    //no argument constructor
    Mypoint()
    {
        x = 0;
        y = 0;
    }

    //argument with the given arguments
    Mypoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    //getter functions
    double getX()
    {
        return x;
    }

    double getY()
    {
        return y;
    }

    //method to compute the distance
    public double distance(double x2, double y2)
    {
        double dis = Math.sqrt(Math.pow(y2-y,2) + Math.pow(x2 - x,2));

        return dis;
    }
}