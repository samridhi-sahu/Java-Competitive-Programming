<<<<<<< HEAD
// Java Programs To find Armstrong Numbers between two given number.

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            int k = i;
            while (k > 0) {
                count++; // counting digits in number
                k = k / 10;
            }
            int p = count;
            int sum = 0;
            int j = i;
            while (j > 0) {
                int l = j % 10;
                int d = 1;
                for (int x = 0; x < p; x++) {
                    d = l * d;
                }
                sum = d + sum;
                j = j / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
=======
// Java Programs To find Armstrong Numbers between two given number.

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            int k = i;
            while (k > 0) {
                count++; // counting digits in number
                k = k / 10;
            }
            int p = count;
            int sum = 0;
            int j = i;
            while (j > 0) {
                int l = j % 10;
                int d = 1;
                for (int x = 0; x < p; x++) {
                    d = l * d;
                }
                sum = d + sum;
                j = j / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
>>>>>>> 7cb0564edb08a99206f9cedfc1d4d30f9eb86f28
}