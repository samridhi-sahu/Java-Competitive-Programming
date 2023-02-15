
// A simple java program to print table of a number

import java.util.Scanner;

public class multiplication_table {

    static void function(int m, int n) {
        if (m == 11) {
            System.out.println("Thank you");
        } else {
            System.out.println(n + " x " + m + " = " + m * n);
            function(m + 1, n);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        function(i, num);
    }
}
