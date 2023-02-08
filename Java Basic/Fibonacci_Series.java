
// java program to find Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibonacci_Series {
    // here pre1 and pre2 are previous two values, result is sum of last two values.
    static int fibonacci(int result, int pre1, int pre2, int number) {
        result = pre1 + pre2;
        pre1 = pre2;
        pre2 = result;
        if (result <= number) {
            System.out.print(result + " ");
            return fibonacci(result, pre1, pre2, number);
        } else {
            System.out.println("\nHere's your Fibonacci Series.");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        // here pv1 and pv2 are initial values we take as 0 and 1 respectively.
        int sum = 0;
        int pv1 = 0;
        int pv2 = 1;
        int num = sc.nextInt();
        System.out.print(pv1 + " " + pv2 + " ");
        fibonacci(sum, pv1, pv2, num);
    }
}
