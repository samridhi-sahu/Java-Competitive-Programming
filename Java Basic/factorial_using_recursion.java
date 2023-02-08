// java program to find factorial of a number using recursion

import java.util.Scanner;

public class factorial_using_recursion {

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1); // applying recursion
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number here : ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.print("Fctorial of " + number + " is : " + result);

    }
}
