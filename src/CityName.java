import java.util.Scanner;

public class CityName
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        //Declaring a variable for switch expression
        System.out.print("Please enter any alphabet from a to f: ");
        char CityName = scanner.next().charAt(0);
        //Switch expression
        switch(CityName)
        {
            //Case statements
            case 'a':
                System.out.print("Accident, MD.");
                break;
            case 'b':
                System.out.print("Bacon Level, AL.");
                break;
            case 'c':
                System.out.print("Cut and Shoot, TX.");
                break;
            case 'd':
                System.out.print("Deadhorse, AK.");
                break;
            case 'e':
                System.out.print("Embarrass, MN.");
                break;
            case 'f':
                System.out.print("Fluffy Landing, FL.");
                break;
            //Default case statement
            default:
                System.out.print("It is an invalid entry. Please try again...");
        }
    }
}
