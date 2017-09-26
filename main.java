import java.util.Scanner;
public class main
{
    public static void main (String [] args)
    {
        Scanner scnr = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = scnr.nextInt();

        number *= number;

        System.out.println("Your number squared: " + number);
    }
}
