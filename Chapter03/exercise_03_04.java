//Write a program that randomly generates an integer between 1 and 12, and
//displays the month according to the number

public class exercise_03_04 {
    public static void main(String[] args) {

        //generates a random number 1 to 12
        int num_month = 1 + (int) (Math.random() * 12);
        String monthname;

        switch (num_month) {
            case 1:
                monthname = "January";
                break;
            case 2:
                monthname = "February";
                break;
            case 3:
                monthname = "March";
                break;
            case 4:
                monthname = "April";
                break;
            case 5:
                monthname = "May";
                break;
            case 6:
                monthname = "June";
                break;
            case 7:
                monthname = "July";
                break;
            case 8:
                monthname = "August";
                break;
            case 9:
                monthname = "September";
                break;
            case 10:
                monthname = "October";
                break;
            case 11:
                monthname = "November";
                break;
            case 12:
                monthname = "December";
                break;
            default:
                monthname = "Illegal month name";
        }

        //printing the corresponding number
        System.out.println("month " +num_month +" is " +monthname);
    }
}

