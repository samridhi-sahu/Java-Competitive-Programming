import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int res = powerFunction(n, p);
        System.out.println("2 Rest to Power 7 is : " + res);
    }

    static int powerFunction(int n, int p) {
        if (p == 0)
            return 1;
        int smaller = powerFunction(n, p - 1);
        int bigger = n * smaller;
        return bigger;
    }
}
