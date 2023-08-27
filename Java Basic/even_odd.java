import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Your given number is EVEN.");
        } else {
            System.out.println("Your given number is ODD.");
        }
    }
}
