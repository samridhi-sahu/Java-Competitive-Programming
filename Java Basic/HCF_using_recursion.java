
// A java program to find highest common factor using recursion.

import java.util.Scanner;

public class HCF_using_recursion {
    // creating function which takes three arguments.
    static int fun(int a, int b, int x) {

        if (a % x == 0 && b % x == 0) {
            return x;
        } else {
            return fun(a, b, x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int greater;
        if (num1 > num2) {
            greater = num1;
        } else {
            greater = num2;
        }
        // calling a function while passing arguments.
        int result = fun(num1, num2, greater);
        System.out.println("HCF of the given two numbers is : " + result);
    }
}
