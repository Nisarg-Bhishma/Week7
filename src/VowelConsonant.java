import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Declaring a variable for switch expression
        System.out.print("Please enter any Alphabet: ");
        char ch=scanner.next().charAt(0);
        //Switch expression
        switch(ch)
        {
            //Case statements
            case 'a':
                System.out.println("This is a Vowel character.");
                break;
            case 'A':
                System.out.println("This is a Vowel character.");
                break;
            case 'e':
                System.out.println("This is a Vowel character.");
                break;
            case 'E':
                System.out.println("This is a Vowel character.");
                break;
            case 'i':
                System.out.println("This is a Vowel character.");
                break;
            case 'I':
                System.out.println("This is a Vowel character.");
                break;
            case 'o':
                System.out.println("This is a Vowel character.");
                break;
            case 'O':
                System.out.println("This is a Vowel character.");
                break;
            case 'u':
                System.out.println("This is a Vowel character.");
                break;
            case 'U':
                System.out.println("This is a Vowel character.");
                break;

            //Default case statement
            default:
                System.out.println("This is a Consonant character.");
        }
    }
}
