//Cramer's rule to solve linear equations
//3.4x+50.2y=44.5
//2.1x+.55y = 5.9
public class exercise_01_13
{
    public static void main(String[] args)
    {
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;

        double c = 2.1;
        double d = .55;
        double f = 5.9;

        //computing the value of x
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);

        System.out.printf("x: %.3f\n", x);
        System.out.printf("y: %.3f\n", y);
    }
}
