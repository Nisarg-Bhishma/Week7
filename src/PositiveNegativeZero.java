import java.util.Scanner;

public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter any Number: ");
        int a=scanner.nextInt();
        //Declaring a variable for switch expression
        int b;
        if (a > 0)
        {
            b = 1;
        }
        else if (a<0)
        {
            b = 2;
        }
        else
        {
            b = 3;
        }
        //Switch expression
        switch(b)
        {
            //Case statements
            case 1:
                System.out.println(a+ " Is a Positive Number.");
                break;
            case 2 :
                System.out.println(a+ " Is a Negative Number");
                break;
            //Default case statement
            default:
                System.out.println(a+ " Is a Zero.");
        }
    }
}
