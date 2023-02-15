
// java program for taking numbers as scs till the user enters ‘x’, after that print sum of all

import java.util.Scanner;

public class sum_of_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer numbers here : ");
        String str = "";
        int sum = 0;
        int i = 0;

        // check number is equals to x or not

        while (!str.equals("x")) {
            str = sc.next();
            if (!str.equals("x")) {
                int number = Integer.parseInt(str);
                sum = sum + number;
                i++;
            }
        }
        System.out.println(sum);
    }
}