import java.util.Scanner;

public class WeekDays
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Declaring a variable for switch expression
        System.out.print("Please enter any Number: ");
        int a = scanner.nextInt();
        //Switch expression
        switch(a)
        {
            //Case statements
            case 1:
                System.out.print("Sunday is 1st day of the week.");
                break;
            case 2 :
                System.out.print("Monday is 2nd day of the week.");
                break;
            case 3 :
                System.out.print("Tuesday is 3rd day of the week.");
                break;
            case 4 :
                System.out.print("Wednesday is 4th day of the week.");
                break;
            case 5 :
                System.out.print("Thursday is 5th day of the week.");
                break;
            case 6 :
                System.out.print("Friday is the 6th day of the week.");
                break;
            case 7 :
                System.out.print("Saturday is the 7th day of the week.");
                break;
            //Default case statement
            default:
                System.out.print("Invalid Entry.");
        }
    }
}
