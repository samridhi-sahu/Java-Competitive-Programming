
// java program to find a string is palindrome or not.

import java.util.Scanner;
import java.lang.*;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int size = str.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == str.charAt(size - 1 - i)) {
                count++;
            }
        }
        if (count == size) {
            System.out.println("Yes String is a Palindrome");
        } else {
            System.out.println("No String is not a Palindrome");
        }
    }
}
