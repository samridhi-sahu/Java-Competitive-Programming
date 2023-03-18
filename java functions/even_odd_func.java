
// 2. Define a program to find out whether a given number is even or odd.

import java.util.*;

public class even_odd_func {
    public static void even_odd(int num) {
        if (num % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        even_odd(num);
    }
}
