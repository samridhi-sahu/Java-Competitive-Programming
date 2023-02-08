
// Simple multiplication program for two floating point numbers with 2 decimal point
import java.util.Formatter;
import java.util.Scanner;

public class multiply_two_floatingpoint_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number : ");
        float num2 = sc.nextFloat();
        float num3 = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : ");
        System.out.println("without precision : " + num3);

        // scpecifying decimal precision using Formatter

        Formatter format = new Formatter();
        System.out.print("with precision : ");
        System.out.println(format.format("%.2f", num3));
    }
}
