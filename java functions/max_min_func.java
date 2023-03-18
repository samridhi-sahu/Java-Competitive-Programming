// 1. Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.

import java.util.*;
public class max_min_func {
    public static int max(int a, int b, int c) {
        if(a>b&&a>c) return a;
        else if(b>a&&b>c) return b;
        else return c;
    }
    public static int min(int a, int b, int c) {
        if(a<b&&a<c) return a;
        else if(b<a&&b<c) return b;
        else return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maximum = max(a, b, c);
        System.out.println("Mximum number among three numbers is : "+maximum);
        int minimum = min(a, b, c);
        System.out.println("Minimum number among three numbers is : "+minimum);
    }    
}
