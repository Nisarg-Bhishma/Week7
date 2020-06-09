import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter value of A: ");
        int a=scanner.nextInt();
        System.out.print("Please enter value of B: ");
        int b=scanner.nextInt();
        //Declaring a variable for switch expression
        System.out.print("Please select an arithmetic operator from to perform desire operation: ");
        char ch=scanner.next().charAt(0);
        int total;
        //Switch expression
        switch(ch)
        {
            //Case statements
            case '+':
            {
                total=a+b;
                System.out.println("Addition of "+a+" and "+b+" is "+total);
                break;
            }
            case '-':
            {
                total=a-b;
                System.out.println("Subtraction of "+a+" and "+b+" is "+total);
                break;
            }
            case '*':
            {
                total=a*b;
                System.out.println("Multiplication of "+a+" and "+b+" is "+total);
                break;
            }
            case '/':
            {
                total=a/b;
                System.out.println("Division of "+a+" and "+b+" is "+total);
                break;
            }
            //Default case statement
            default:
            {
                System.out.println("You have entered incorrect symbol..., Please select from +, -, *, /");
            }
        }
    }
}
