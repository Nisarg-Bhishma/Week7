import java.util.Scanner;

public class GreatestLargest
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter value of A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter value of B: ");
        int b = scanner.nextInt();
        System.out.print("Please enter value of C: ");
        int c = scanner.nextInt();

        if ((a > b) && (a > c)) //If expression
        {
            System.out.println("Greatest number from the entered number is :" + a);
        } else if ((b > a) && (b > c)) //If expression
        {
            System.out.println("Greatest number from the entered number is :" + b);
        }
        else
        {
            System.out.println("Greatest number from the entered number is :" +c);
        }

    }
}
