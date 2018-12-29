/*
    Financial Application Payroll
 */
import java.util.Scanner;

public class exercise_04_23 {
    public static void main(String[] args) {
        String name;
        double hours, payrate, fed_tax_rate, state_tax_rate;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = input.nextLine();

        System.out.print("Enter number of hours worked in a week ");
        hours = input.nextDouble();

        System.out.print("Enter hourly pay rate ");
        payrate = input.nextDouble();

        System.out.print("Enter federal tax withholdings rate ");
        fed_tax_rate = input.nextDouble();

        System.out.print("Enter state tax withholdings rate ");
        state_tax_rate = input.nextDouble();

        //computing calculations here
        double gross_pay = hours*payrate;
        double federal = gross_pay * fed_tax_rate;
        double state = gross_pay * state_tax_rate;
        double net_pay = gross_pay - federal-state;

        System.out.println("-------------------------------------");
        //printing the payroll statement
        System.out.println("Employees Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay rate: $" + payrate);
        System.out.println("Gross pay: $" + gross_pay);

        System.out.println("Deductions:");
        System.out.println("    Federal withholdings $:" + federal);
        System.out.println("    State withholdings $:" + state);
        System.out.println("    Total Deductions $:" + (federal + state));

        System.out.println("Net Pay $:" + net_pay);
    }
}
