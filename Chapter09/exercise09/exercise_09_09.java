import java.util.Scanner;
public class exercise_09_09
{
    public static void main(String[] args)
    {
        //poly1 object without any arguments
        RegularPolygon poly1 = new RegularPolygon();
        System.out.println("Regular Polygon1 ");
        System.out.println("perimeter  " + poly1.getPerimeter());
        System.out.printf("area  %.2f\n" , poly1.getArea());
        System.out.println("---------------------------" );

        //poly2 object without 2 arguments
        RegularPolygon poly2 = new RegularPolygon(6,4);
        System.out.println("Regular Polygon2 ");
        System.out.println("perimeter  " + poly2.getPerimeter());
        System.out.printf("area  %.2f\n" , poly2.getArea());
        System.out.println("---------------------------" );


        //poly3 object with 4 arguments
        RegularPolygon poly3 = new RegularPolygon(10,4, 5.6,7.8);
        System.out.println("Regular Polygon3 ");
        System.out.println("perimeter  " + poly3.getPerimeter());
        System.out.printf("area  %.2f \n" , poly3.getArea());
    }
}
