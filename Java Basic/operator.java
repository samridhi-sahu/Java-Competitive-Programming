// java program to perform operation on the basis of user input operator

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter operator here : ");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        } else if (c == '-') {
            System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
        } else if (c == '*') {
            System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        } else if (c == '/') {
            System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        } else if (c == '%') {
            System.out.println("Remainder of " + num1 + " and " + num2 + " is " + (num1 % num2));
        } else {
            System.out.println("Not a valid operator");
        }
    }
}
