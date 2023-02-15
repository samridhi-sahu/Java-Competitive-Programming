
// java program to find LCM of two numbers
import java.util.Scanner;

public class find_LCM_of_two_numbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        int i = 2;
        for (int j = 0; a > 1 || b > 1; j++) {
            if (a % i == 0 || b % i == 0) {
                if (a % i == 0) {
                    a = a / i;
                }
                if (b % i == 0) {
                    b = b / i;
                }
                result = result * i;
            } else {
                i++;
            }
        }
        System.out.println(result);
    }
}
