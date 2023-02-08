
// program for swapping two integers
import java.util.Scanner;
import java.util.Collections;

public class swap_two_numbers {
    public static void main(String[] args) {
        System.out.println("Swapping two numbers...");
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.println("enter first number : ");
        a = sc.nextInt();
        System.out.println("enter second number : ");
        b = sc.nextInt();
        System.out.println("before swapping numbers are : first number = " + a + " and second number = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping numbers are : first number = " + a + " and second number = " + b);

    }
}
