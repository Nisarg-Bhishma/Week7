import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        //Declaring a variable for switch expression
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any Number: ");
        int a = scanner.nextInt();
        //Declaring a variable for switch expression
        int b=a%2;
        //Switch expression
        switch(b)
        {
            //Case statements
            case 0:
                System.out.print("Entered number is even number.");
                break;
            //Default case statement
            default:
                System.out.print("Entered number is odd number.");
        }
    }
}
