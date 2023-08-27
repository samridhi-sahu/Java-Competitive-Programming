<<<<<<< HEAD
// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.*;

public class eligibleToVote {
    public static void eligible(int age) {
        if (age >= 18)
            System.out.println("Person is eligible to vote.");
        else
            System.out.println("Person is not eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligible(age);
    }
}
=======
// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.*;

public class eligibleToVote {
    public static void eligible(int age) {
        if (age >= 18)
            System.out.println("Person is eligible to vote.");
        else
            System.out.println("Person is not eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligible(age);
    }
}
>>>>>>> 7cb0564edb08a99206f9cedfc1d4d30f9eb86f28
