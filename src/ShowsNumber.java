import java.util.Scanner;

public class ShowsNumber
{
    public static void main(String[] args)
    {
        //Declaring a variable for switch expression
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any Number: ");
        int a = scanner.nextInt();
        //Switch expression
        switch(a)
        {
            //Case statements
            case 1:
                System.out.print("Entered number is 1.");
                break;
            case 2 :
                System.out.print("Entered number is 2.");
                break;
            case 3 :
                System.out.print("Entered number is 3.");
                break;
            case 4 :
                System.out.print("Entered number is 4.");
                break;
            case 5 :
                System.out.print("Entered number is 5.");
                break;
            case 6 :
                System.out.print("Entered number is 6.");
                break;
            case 7 :
                System.out.print("Entered number is 7.");
                break;
            case 8 :
                System.out.print("Entered number is 8.");
                break;
            case 9 :
                System.out.print("Entered number is 9.");
                break;
            //Default case statement
            default:System.out.println("Not Allowed entry.");
        }
    }
}
