
// program for taking user input and perform addition operation
import java.util.Scanner;

public class addtwonumbers {
    public static void main(String[] args) {
        // taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        System.out.println("Enter First numbers : ");
        int a = scan.nextInt();
        System.out.println("Enter Second numbers : ");
        int b = scan.nextInt();
        // adding two numbers
        int c = a + b;
        System.out.println("Sum is : " + c);
    }
}