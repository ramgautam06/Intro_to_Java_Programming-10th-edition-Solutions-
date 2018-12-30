public class exercise_09_01
{
    public static void main(String[] args) {

        //creates the rectangle with given default values
        Rectangle rectangle0 = new Rectangle();

        // Create a Rectangle with width 2 and height 2
        Rectangle rectangle1 = new Rectangle(2, 2);

        // Create a Rectangle with width 9.2 and height 7
        Rectangle rectangle2 = new Rectangle(9.2, 7);

        // Display the width, height, area, and perimeter of rectangle0
        System.out.println("\n Rectangle 0");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle0.width);
        System.out.println("Height:    " + rectangle0.height);
        System.out.println("Area:      " + rectangle0.getArea());
        System.out.println("Perimeter: " + rectangle0.getPerimeter());

        // Display the width, height, area, and perimeter of rectangle1
        System.out.println("\n Rectangle 1");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle1.width);
        System.out.println("Height:    " + rectangle1.height);
        System.out.println("Area:      " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Display the width, height, area, and perimeter of rectangle2
        System.out.println("\n Rectangle 2");
        System.out.println("-------------");
        System.out.println("Width:     " + rectangle2.width);
        System.out.println("Height:    " + rectangle2.height);
        System.out.printf("Area:      %.2f\n" , rectangle2.getArea());
        System.out.printf("Perimeter: %.2f\n" , rectangle2.getPerimeter());
    }
}
