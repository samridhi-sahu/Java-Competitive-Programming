
// java program to find whether a year is leap year or not.

import java.util.Scanner;

public class find_leap_year {
    public static void main(String[] args) {
        System.out.println("Enter a year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
