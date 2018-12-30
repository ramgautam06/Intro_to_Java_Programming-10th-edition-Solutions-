public class Rectangle
{
    // Width of rectangle and height of rectangle
    double width;
    double height;

    //A constructor without any arguments that creates a default rectangle
    Rectangle()
    {
        width = 1;
        height = 1;
    }

    //A constructor that creates a rectangle with the given width and height
    Rectangle(double newWidth, double newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    //Return the area of the rectangle
    double getArea() {
        return width * height;
    }

    //Return the perimeter of the rectangle
    double getPerimeter() {
        return 2 * (width + height);
    }
}

