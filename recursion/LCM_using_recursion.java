// A java program to find lowest common multiple using recursion.

import java.util.Scanner;

public class LCM_using_recursion {

    // creating function which takes three arguments for LCM
    static int fun1(int p, int q, int r) {
        int hcf = fun2(p, q, r);
        p = p / hcf;
        q = q / hcf;
        return p * q * hcf;
    }
    // creating function which takes three arguments for HCF

    static int fun2(int a, int b, int x) {
        if (a % x == 0 && b % x == 0) {
            return x;
        } else {
            return fun2(a, b, x - 1);
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

        int result = fun1(num1, num2, greater);
        System.out.println("LCM of the given two numbers is : " + result);
    }
}
