import java.util.Scanner;

public class ReverseStringExample
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter string: ");
        String S1=scanner.nextLine();
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(S1); // concatenates the given argument with string S1

        stringBuilder=stringBuilder.reverse(); //to reverse the string.
        System.out.println("Reverse of the entered String is: "+stringBuilder);
    }
}